package pl.net.norbitor.stexa.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class CategoryTest {
    @Test
    void testThrowExceptionWhenMoreQuestionToShuffleThanQuestions() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Category("category", prepareOneQuestion(), 2));
    }

    private Set<Question> prepareOneQuestion() {
        return Set.of(new Question("question", Set.of(), Set.of(new Answer("answer"))));
    }
}
