package pl.net.norbitor.stexa.vao;

import java.util.Objects;

public class Answer {
    private final String content;

    public Answer(String content) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Answer content must contain non-empty value");
        }
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(content, answer.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
