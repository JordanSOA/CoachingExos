import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class NaturalNumberTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testSmallPerfectNumberIsClassifiedCorrectly() {
        assertEquals(NaturalNumber.Classification.PERFECT, new NaturalNumber(6).getClassification());
    }


    @Test
    public void testMediumPerfectNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.PERFECT, new NaturalNumber(28).getClassification());
    }


    @Test
    public void testLargePerfectNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.PERFECT, new NaturalNumber(33550336).getClassification());
    }


    @Test
    public void testSmallAbundantNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.ABUNDANT, new NaturalNumber(12).getClassification());
    }


    @Test
    public void testMediumAbundantNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.ABUNDANT, new NaturalNumber(30).getClassification());
    }


    @Test
    public void testLargeAbundantNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.ABUNDANT, new NaturalNumber(33550335).getClassification());
    }


    @Test
    public void testSmallestPrimeDeficientNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.DEFICIENT, new NaturalNumber(2).getClassification());
    }


    @Test
    public void testSmallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.DEFICIENT, new NaturalNumber(4).getClassification());
    }


    @Test
    public void testMediumDeficientNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.DEFICIENT, new NaturalNumber(32).getClassification());
    }


    @Test
    public void testLargeDeficientNumberIsClassifiedCorrectly() {
       assertEquals(NaturalNumber.Classification.DEFICIENT, new NaturalNumber(33550337).getClassification());
    }


    @Test
    /*
     * The number 1 has no proper divisors (https://en.wikipedia.org/wiki/Divisor#Further_notions_and_facts), and the
     * additive identity is 0, so the aliquot sum of 1 should be 0. Hence 1 should be classified as deficient.
     */
    public void testThatOneIsCorrectlyClassifiedAsDeficient() {
       assertEquals(NaturalNumber.Classification.DEFICIENT, new NaturalNumber(1).getClassification());
    }


//    @Test
//    public void testThatNonNegativeIntegerIsRejected() {
//        assertThrows(IllegalArgumentException.class,
//                () -> new NaturalNumber(0),
//                "You must supply a natural number (positive integer)");
//    }
//
//
//    @Test
//    public void testThatNegativeIntegerIsRejected() {
//        assertThrows(IllegalArgumentException.class,
//                () -> new NaturalNumber(-1),
//                "You must supply a natural number (positive integer)");
//    }


    @Test
    public void testThatNonNegativeIntegerIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You must supply a natural number (positive integer)");

        new NaturalNumber(0);
    }

    @Test
    public void testThatNegativeIntegerIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You must supply a natural number (positive integer)");

        new NaturalNumber(-1);
    }
}