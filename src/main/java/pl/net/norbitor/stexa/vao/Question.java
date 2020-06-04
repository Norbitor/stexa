package pl.net.norbitor.stexa.vao;

import java.util.List;

public class Question {
    private final String content;
    private final List<Answer> incorrectAnswerList;
    private final List<Answer> correctAnswerList;

    public Question(String content, List<Answer> incorrectAnswerList, List<Answer> correctAnswerList) {
        this.content = content;
        this.incorrectAnswerList = incorrectAnswerList;
        this.correctAnswerList = correctAnswerList;
    }

    public String getContent() {
        return content;
    }

    public List<Answer> getAnswerList() {
        return null;
    }

    public List<Answer> getCorrectAnswerList() {
        return correctAnswerList;
    }

    public boolean isMultiSelect() {
        return false;
    }
}
