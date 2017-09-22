import java.util.Arrays;
import java.util.Comparator;

/**
 * Program to sort a two-dimensional array by row then column
 * @author Laura Witherspoon
 * Assignment: 8.16
 * Date: 9/14/2017
 */

public class ArraySort {

    /**
     * Sorts a two-dimensional array with a max row length of 3
     * @param m is the two-dimensional array to sort
     */
    private static void sort(int m[][]) {

        // Define custom comparator to allow sort of multiple columns in 2D array
        final Comparator<int[]> arrayComparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    if (a[1] == b[1]) {
                        return Integer.compare(a[2],b[2]);
                    }
                    else {
                        return Integer.compare(a[1],b[1]);
                    }
                }
                return Integer.compare(a[0],b[0]);
            }
        };

        Arrays.sort(m, arrayComparator);
    }

    /**
     * Takes array and returns original array sorted
     * @param array 2D array to sort
     * @return sorted 2D array
     */
    static int[][] getSortedArray(int[][] array) {
        sort(array);
        return array;
    }

    static String displayArrayAsString(int array[]) {
        String result = "{";

        for (int i = 0; i < array.length; i++) {
            result += array[i];
            result += (i == array.length - 1 ? "}" : ",");
        }

        return result;
    }

    /**
     * Returns string to display given 2-dimensional array
     * @param array 2-dimensional array of any length
     * @return string of array's values
     */
    static String displayArrayAsString(int array[][]) {
        String result = "{";

        for (int i = 0; i < array.length; i++) {
            result += "{";

            for (int j = 0; j < array[i].length; j++) {
                // If current int is not last in array, append a trailing comma
                result += (j == array[i].length - 1 ? array[i][j] : array[i][j] + ",");
            }

            // If last sub-array, display closing bracket
            // Otherwise append trailing comma
            result += (i == array.length - 1 ? "}}" : "},");
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        // Display original array
        System.out.println("Original unsorted array:");
        System.out.println(displayArrayAsString(array) + "\n");

        getSortedArray(array);

        // Display sorted array
        System.out.println("Sorted array:");
        System.out.println(displayArrayAsString(array) + "\n");


    }
}
