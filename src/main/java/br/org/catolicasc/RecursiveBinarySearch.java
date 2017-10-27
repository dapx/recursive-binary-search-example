package br.org.catolicasc;

import java.util.Arrays;

/**
 * Class to perform a binary search into an integer array to find an element specified.
 */
public class RecursiveBinarySearch {

    private int valueToSearch;
    private int[] values;

    /**
     * Constructor to make the binary search
     * @param valueToSearch A integer value to search into the array
     * @param values An array of integer
     */
    public RecursiveBinarySearch(int valueToSearch, int... values) {
        this.valueToSearch = valueToSearch;
        this.values = values;
    }

    /**
     * The public method to start the search
     * @return
     */
    public int search() {
        return search(0, values.length - 1);
    }

    /**
     * The private method to make the recursive search
     * @param start The initial index
     * @param end The last index
     * @return
     */
    private int search(int start, int end) {
        if(start <= end) {
            int middle = (start + end) / 2;
            System.out.println(String.format("Middle %d Valor %d", middle, values[middle]));

            if(values[middle] == valueToSearch) {
                return middle;

            } else if (values[middle] > valueToSearch) {
                System.out.println(String.format("It Will make a new search: Start %d, End %d", start, (middle - 1)));
                return search(start, middle - 1);

            } else {
                System.out.println(String.format("It Will make a new search: Start %d, End %d", (middle + 1), end));
                return search(middle + 1, end);
            }
        } else {
            return -1;
        }
    }
}
