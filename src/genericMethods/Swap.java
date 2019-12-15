package genericMethods;

import java.util.Arrays;

/**
 * Swap is a method class that swaps the values of two indexes
 * @author Stephen Roberts
 * @version 15/12/19
 * @param <T>
 */
public class Swap<T> {

    /**
     * SwapItem is the method in the swap class, it swaps two objects of its given indexes in a array.
     * @param array
     * @param swap1
     * @param swap2
     * @return
     */
    public T[] SwapItem(T[] array,int swap1, int swap2) {
        T tmp = array[swap1];
        array[swap1] = array[swap2];
        array[swap2] = tmp;
        return array;
    }
}
