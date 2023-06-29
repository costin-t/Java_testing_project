import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        int[] result = BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void bubbleSort2() {
        int[] arr = {5, 1, 4, 6, 8};
        int[] expected = {1, 4, 5, 6, 8};
        int[] result = BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, result);
    }
}