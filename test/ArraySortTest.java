import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortTest {

    private static int[][] input = {{4,2,1},{1,7,6},{4,2,5},{1,7,2},{1,1,0},{4,2,5}};

    @Test
    public void getSortedArray() throws Exception {
        int[][] expected = {{1,1,0},{1,7,2},{1,7,6},{4,2,1},{4,2,5},{4,2,5}};
        assertArrayEquals("msg", expected, ArraySort.getSortedArray(input));
    }

    @Test
    public void displayArrayAsString() throws Exception {
        String expected = "{{4,2,1},{1,7,6},{4,2,5},{1,7,2},{1,1,0},{4,2,5}}";
        String actual = ArraySort.displayArrayAsString(input);

        assertTrue("Failed to display 2-dimensional array as string", expected.equals(actual));
    }

}