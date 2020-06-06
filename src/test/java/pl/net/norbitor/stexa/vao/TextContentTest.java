package pl.net.norbitor.stexa.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextContentTest {
    @Test
    void testThrowExceptionWhenContentIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new TextContent(null));
    }

    @Test
    void testThrowExceptionWhenContentIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new TextContent(""));
    }
}
