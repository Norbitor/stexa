package pl.net.norbitor.stexa.vao;

import java.util.Set;

/**
 * Class representing test for end user.
 *
 * This class represents test prepared to show to the user. It contains full
 * list of questions and some metadata such as title and available time.
 */
public class Test {
    private final TextContent title;
    private final Set<Question> questions;
    private final int availableTimeInMinutes;

    public Test(String title, Set<Question> questions, int availableTimeInMinutes) {
        this.title = new TextContent(title);
        this.questions = questions;
        this.availableTimeInMinutes = availableTimeInMinutes;
    }

    public String getTitle() {
        return title.getContent();
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public int getAvailableTimeInMinutes() {
        return availableTimeInMinutes;
    }
}
