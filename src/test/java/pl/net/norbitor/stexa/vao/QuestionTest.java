package pl.net.norbitor.stexa.vao;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class QuestionTest {
    @Test
    public void testThrowExceptionWhenNoCorrectAnswerIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Question("question", List.of(new Answer("A")), List.of()));
    }

    @Test
    public void testReturnAllAnswers() {
        List<Answer> answers = List.of(new Answer("A"), new Answer("B"), new Answer("C"));

        Question q = new Question("question", answers.subList(0, 2), answers.subList(2, 3));
        Assertions.assertEquals(answers, q.getAnswerList());
    }

    @Test
    public void testReturnTrueIfQuestionIsMultiSelect() {
        Question q = new Question("question",
                List.of(new Answer("A")),
                List.of(new Answer("B"), new Answer("C")));

        Assertions.assertTrue(q.isMultiSelect());
    }
}
