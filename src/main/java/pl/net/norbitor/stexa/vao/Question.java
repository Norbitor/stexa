package pl.net.norbitor.stexa.vao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question {
    private final String content;
    private final List<Answer> incorrectAnswerList;
    private final List<Answer> correctAnswerList;

    public Question(String content, List<Answer> incorrectAnswerList, List<Answer> correctAnswerList) {
        this.content = content;
        this.incorrectAnswerList = incorrectAnswerList;
        if (correctAnswerList.isEmpty()) {
            throw new IllegalArgumentException("Question has to have at least one correct answer");
        }
        this.correctAnswerList = correctAnswerList;
    }

    public String getContent() {
        return content;
    }

    public List<Answer> getAnswerList() {
        return Stream.concat(incorrectAnswerList.stream(), correctAnswerList.stream())
                .collect(Collectors.toList());
    }

    public List<Answer> getCorrectAnswerList() {
        return correctAnswerList;
    }

    public boolean isMultiSelect() {
        return correctAnswerList.size() > 1;
    }
}
