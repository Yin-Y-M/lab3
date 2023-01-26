import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
	@Test 
	public void testReverseInPlace() {
    	int[] input1 = { 3 };
    	ArrayExamples.reverseInPlace(input1);
    	ssertArrayEquals(new int[]{ 3 }, input1);
	}
}