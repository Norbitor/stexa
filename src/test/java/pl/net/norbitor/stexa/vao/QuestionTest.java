package pl.net.norbitor.stexa.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class QuestionTest {
    @Test
    public void throwExceptionWhenNoCorrectAnswerIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Question("question", Set.of(new Answer("A")), Set.of()));
    }

    @Test
    public void returnAllAnswers() {
        Set<Answer> answers = Set.of(new Answer("A"), new Answer("B"), new Answer("C"));

        Question q = new Question(
                "question",
                Set.of(new Answer("A"), new Answer("B")),
                Set.of(new Answer("C")));
        Assertions.assertEquals(answers, q.getAnswerSet());
    }

    @Test
    public void returnTrueIfQuestionIsMultiSelect() {
        Question q = new Question("question",
                Set.of(new Answer("A")),
                Set.of(new Answer("B"), new Answer("C")));

        Assertions.assertTrue(q.isMultiChoice());
    }

    @Test
    public void returnValidAmountOfCorrectAnswers() {
        Question q = new Question("question",
                Set.of(),
                Set.of(new Answer("A"), new Answer("B"), new Answer("C")));

        Assertions.assertEquals(3, q.getCorrectAnswerAmount());
    }

    @Test
    public void correctAnswerIsClassifiedAsCorrect() {
        Answer answerA = new Answer("A");
        Answer answerB = new Answer("B");
        Answer answerC = new Answer("C");
        Set<Answer> answers = Set.of(answerA, answerB, answerC);

        Question q = new Question("question",
                Set.of(new Answer("D")),
                answers);

        Assertions.assertTrue(q.isCorrectAnswer(answerB));
    }

    @Test
    public void incorrectAnswerIsClassifiedAsIncorrect() {
        Answer answerA = new Answer("A");

        Question q = new Question("question",
                Set.of(answerA),
                Set.of(new Answer("B"), new Answer("C")));

        Assertions.assertFalse(q.isCorrectAnswer(answerA));
    }
}
