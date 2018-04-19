import leetCode.TwoSum;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void assertSum() {
        TwoSum twoSum = new TwoSum();

        int[] input = new int[] {1, 2, 3, 4};
        int target = 3;

        int[] expectedResult = new int[] {0, 1};
        int[] indices = twoSum.findIndices(input, target);
        assertArrayEquals(indices, expectedResult);
    }

    @Test
    public void assertSumTwo() {
        TwoSum twoSum = new TwoSum();

        int[] input = new int[] {5, 1, 3, 5};
        int target = 8;

        int[] expectedResult = new int[] {0, 2};
        int[] result = twoSum.findIndices(input, target);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void assertInvalidInput() {
        TwoSum twoSum = new TwoSum();

        int[] input = new int[] {1};
        int target = 3;

        int[] expectedResult = input;
        int[] result = twoSum.findIndices(input, target);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void assertInvalidInputTwo() {
        TwoSum twoSum = new TwoSum();

        int[] input = new int[] {5, 1, 10};
        int target = 3;

        int[] expectedResult = new int[] {};
        int[] result = twoSum.findIndices(input, target);
        assertArrayEquals(expectedResult, result);
    }

}
