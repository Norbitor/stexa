package pl.net.norbitor.stexa.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnswerTest {
    @Test
    public void testThrowIllegalArgumentExceptionWhenContentIsNullOrEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Answer(null));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Answer(""));
    }
}
