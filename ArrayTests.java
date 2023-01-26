import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

    @Test
    public void testReversed() {
        int[] input1 = { };
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }

    //following are my own tests
    @Test
    public void testReverseInPlaceMy1() {
        int[] input1 = {1,2,3,4,5};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{5,4,3,2,1}, input1);
    }

    @Test
    public void testReversedMy1() {
        int[] input1 = {3,1,4,1,5};
        assertArrayEquals(new int[]{5,1,4,1,3}, ArrayExamples.reversed(input1));
    }

    @Test
    public void testAverageWithoutLowestMy1(){
        double[] input1 = {8.5,3.7,8.5,5.9,6.3,3.7};
        double expected = (8.5+8.5+5.9+6.3)/4;
        assertEquals(ArrayExamples.averageWithoutLowest(input1),expected,1E-10);
    }
}

