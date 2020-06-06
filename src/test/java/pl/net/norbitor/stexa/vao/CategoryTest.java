package pl.net.norbitor.stexa.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CategoryTest {
    @Test
    void testThrowExceptionWhenMoreQuestionToShuffleThanQuestions() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Category("category", prepareOneQuestion(), 2));
    }

    private List<Question> prepareOneQuestion() {
        return List.of(new Question("question", List.of(), List.of(new Answer("answer"))));
    }
}
