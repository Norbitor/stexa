package pl.net.norbitor.stexa.vao;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representation of question.
 *
 * Stores information about question content and its answers set (both correct and incorrect)
 */
public class Question {
    private final String content;
    private final Set<Answer> incorrectAnswerSet;
    private final Set<Answer> correctAnswerSet;

    /**
     * Constructs the Question representation object.
     *
     * @param content Content of a question.
     * @param incorrectAnswerSet Set of incorrect answers for the question. May be empty.
     * @param correctAnswerSet Set of correct answers for a question. Needs to have at least one element.
     */
    public Question(String content, Set<Answer> incorrectAnswerSet, Set<Answer> correctAnswerSet) {
        this.content = content;
        this.incorrectAnswerSet = incorrectAnswerSet;
        if (correctAnswerSet.isEmpty()) {
            throw new IllegalArgumentException("Question has to have at least one correct answer");
        }
        this.correctAnswerSet = correctAnswerSet;
    }

    public String getContent() {
        return content;
    }

    public Set<Answer> getAnswerSet() {
        return Stream.concat(incorrectAnswerSet.stream(), correctAnswerSet.stream())
                .collect(Collectors.toSet());
    }

    public Set<Answer> getCorrectAnswerSet() {
        return correctAnswerSet;
    }

    public boolean isMultichoice() {
        return correctAnswerSet.size() > 1;
    }
}
