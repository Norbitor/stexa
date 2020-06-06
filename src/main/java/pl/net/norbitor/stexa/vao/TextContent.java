package pl.net.norbitor.stexa.vao;

import java.util.Objects;

public class TextContent {
    private final String content;

    public TextContent(String content) {
        if (content == null || content.equals("")) {
            throw new IllegalArgumentException("Content cannot be null or empty");
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
        TextContent textContent = (TextContent) o;
        return textContent.getContent().equals(content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
