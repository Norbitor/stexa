package pl.net.norbitor.stexa.vao;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class QuestionTest {
    @Test
    public void testThrowExceptionWhenNoCorrectAnswerIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Question("question", Set.of(new Answer("A")), Set.of()));
    }

    @Test
    public void testReturnAllAnswers() {
        Set<Answer> answers = Set.of(new Answer("A"), new Answer("B"), new Answer("C"));

        Question q = new Question(
                "question",
                Set.of(new Answer("A"), new Answer("B")),
                Set.of(new Answer("C")));
        Assertions.assertEquals(answers, q.getAnswerSet());
    }

    @Test
    public void testReturnTrueIfQuestionIsMultiSelect() {
        Question q = new Question("question",
                Set.of(new Answer("A")),
                Set.of(new Answer("B"), new Answer("C")));

        Assertions.assertTrue(q.isMultichoice());
    }
}
