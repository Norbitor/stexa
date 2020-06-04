package pl.net.norbitor.stexa.vao;

import java.util.List;

public class Category {
    private final String title;
    private final List<Question> questions;
    private final int questionsToShuffle;

    public Category(String title, List<Question> questions, int questionsToShuffle) {
        this.title = title;
        this.questions = questions;
        this.questionsToShuffle = questionsToShuffle;
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int getQuestionsToShuffle() {
        return questionsToShuffle;
    }
}
