package pl.net.norbitor.stexa.vao;

import java.util.Set;

/**
 * Representation of category - set of questions about related topic.
 *
 * Stores also some metadata about category:
 *  - title
 *  - how much questions should be get from this category (may be used by
 *    some test preparation strategy)
 *
 * @see Question
 */
public class Category {
    private final TextContent title;
    private final Set<Question> questions;
    private final int questionsToShuffle;

    /**
     * Constructs Category representation value object.
     *
     * @param title Title of the category
     * @param questions Set of Questions from this category
     * @param questionsToShuffle How much questions should be get from this category
     * @throws IllegalArgumentException when there are less questions than amount to shuffle
     */
    public Category(String title, Set<Question> questions, int questionsToShuffle) {
        this.title = new TextContent(title);
        this.questions = questions;
        if (questionsToShuffle > questions.size()) {
            throw new IllegalArgumentException("questionsToShuffle needs to be less than or equal of questions amount");
        }
        this.questionsToShuffle = questionsToShuffle;
    }

    public String getTitle() {
        return title.getContent();
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public int getQuestionsToShuffle() {
        return questionsToShuffle;
    }
}
