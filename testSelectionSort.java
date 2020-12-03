import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {}

    @Test
    public void testPositive () {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;


        SelectionSort s = new SelectionSort();
        s.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }

    @Test
    public void testNegative(){
      /** Test data contains negative values only **/
      int[] arr = new int[5];
      arr[0] = -8;
      arr[1] = -9;
      arr[2] = -7;
      arr[3] = -10;
      arr[4] = -2;

      int[] Sortedarr = new int[5];
       Sortedarr[0] = -10;
      Sortedarr[1] = -9;
      Sortedarr[2] = -8;
      Sortedarr[3] = -7;
      Sortedarr[4] = -2;

      SelectionSort s = new SelectionSort();
      s.basicSelectionSort(arr);
      assertArrayEquals(Sortedarr, arr);
    }

    @Test
    public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/

















    }

    @Test
    public void testDuplicates(){
        /** Test data contains duplicates **/

















    }
}
