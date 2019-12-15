package genericMethods;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.fail;

public class SwapTest<T extends Comparable<? super T>> extends Swap{

    private int min = 0;
    private int max = 100;

    void TestIntSwap(int size){

        Random rand = new Random();
        ArrayList arrayl = new ArrayList();
        for(int index=0;index<size;index++){
            arrayl.add(rand.nextInt((max - min) + 1) + min);
        }
        TestSwap(arrayl);
    }

    void TestStringSwap(int size){

        Random rand = new Random();
        ArrayList arrayl = new ArrayList();

        String stringlist = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int index = 0;index<size; index++) {
            arrayl.add(stringlist.charAt(rand.nextInt(stringlist.length())));
        }
        TestSwap(arrayl);
    }

    void TestSwap(ArrayList arrayl){
        Random rand = new Random();
        int upper = arrayl.size();
        int swap1 = rand.nextInt(((upper-1) - 0) + 1) + 0;
        int swap2 = 0;
        for(boolean swaptrue = false;swaptrue != true;){
            swap2 = rand.nextInt(((upper-1) - 0) + 1) + 0;;
            if(swap1 != swap2){
                swaptrue=true;
            }
        }
        T[] array = (T[]) arrayl.toArray((T[]) new Comparable[arrayl.size()]);
        T[] narray = (T[]) arrayl.toArray((T[]) new Comparable[arrayl.size()]);
        array = (T[]) SwapItem(array, swap1,swap2);

        if(array[swap1].compareTo(narray[swap2])==1) {
            fail("Values have not been swapped.");
        }
    }

    @Test
    void testIntSwap4() {
        TestIntSwap(4);
    }

    @Test
    void testStringTen() {TestStringSwap(10);}

    @Test
    void testString1000() {TestStringSwap(1000);}
}
