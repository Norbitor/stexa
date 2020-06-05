package pl.net.norbitor.stexa.vao;

import java.util.List;

public class Test {
    private final String title;
    private final List<Question> questions;
    private final int availableTime;

    public Test(String title, List<Question> questions, int availableTime) {
        this.title = title;
        this.questions = questions;
        this.availableTime = availableTime;
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int getAvailableTime() {
        return availableTime;
    }
}
