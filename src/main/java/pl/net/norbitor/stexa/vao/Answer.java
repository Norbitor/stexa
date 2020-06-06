package pl.net.norbitor.stexa.vao;

import java.util.Objects;

/**
 * Representation of single answer for a question.
 */
public class Answer {
    private final TextContent content;

    /**
     * Constructs Answer object
     *
     * @param content Non-Null and Non-Empty string of answer content
     */
    public Answer(String content) {
        this.content = new TextContent(content);
    }

    public String getContent() {
        return content.getContent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return answer.getContent().equals(content.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
