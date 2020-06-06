package pl.net.norbitor.stexa.test;

import org.junit.jupiter.api.Test;

public class CategoryAwareTestGeneratorTest {
    private static final int TEST_TIME = 30;

    @Test
    public void testGenerateReturnsProperTest() {
        /* specs:
        1. Generator receives some categories (which consists of Questions, which consists of Answers) (!!)
        2. Generator returns Test class object which
          - contains questions from Categories
          - amount of Questions from each Category is determined by questionsToShuffle
         */
    }
}
