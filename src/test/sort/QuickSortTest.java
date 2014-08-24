package test.sort;

import com.bargittachen.com.bargittachen.sort.QuickSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    @Test
    public void quickSortTest(){
        int[] numbers = {5, 1, 4, 9, 3};
        QuickSort.sort(numbers, 0, 4);
        assertEquals(1,numbers[0]);
        assertEquals(3,numbers[1]);
        assertEquals(4,numbers[2]);
        assertEquals(5,numbers[3]);
        assertEquals(9,numbers[4]);
    }

    @Test
    public void quickSort_with_ascending_order(){
        int[] numbers = {1, 2, 3, 4, 5};
        QuickSort.sort(numbers, 0, 4);
        assertEquals(1,numbers[0]);
        assertEquals(2,numbers[1]);
        assertEquals(3,numbers[2]);
        assertEquals(4,numbers[3]);
        assertEquals(5,numbers[4]);
    }

    @Test
    public void quickSort_with_descending_order(){
        int[] numbers = {-1, -2, -3, -4, -5};
        QuickSort.sort(numbers, 0, 4);
        assertEquals(-1,numbers[4]);
        assertEquals(-2,numbers[3]);
        assertEquals(-3,numbers[2]);
        assertEquals(-4,numbers[1]);
        assertEquals(-5,numbers[0]);
    }

    @Test
    public void swapTest(){
        int[] numbers = {5, 1, 4, 9, 3};
        QuickSort.swap(numbers,0,1);
        assertEquals(1,numbers[0]);
        assertEquals(5,numbers[1]);
    }

    @Test
    public void partitionTest(){
        int[] numbers = {5, 1, 4, 9, 3};
        QuickSort.partition(numbers,0,4);
        assertEquals(3,numbers[0]);
        assertEquals(1,numbers[1]);
        assertEquals(4,numbers[2]);
        assertEquals(5,numbers[3]);
        assertEquals(9,numbers[4]);
    }

    @Test
    public void partition_with_ascending_input(){
        int[] numbers = {1, 2, 3, 4, 5};
        QuickSort.partition2(numbers,0,4);
        assertEquals(1,numbers[0]);
        assertEquals(2,numbers[1]);
        assertEquals(3,numbers[2]);
        assertEquals(4,numbers[3]);
        assertEquals(5,numbers[4]);
    }

    @Test
    public void partition_with_descending_input(){
        int[] numbers = {-1, -2, -3, -4, -5};
        QuickSort.partition2(numbers,0,4);
        assertEquals(-5,numbers[0]);
        assertEquals(-2,numbers[1]);
        assertEquals(-3,numbers[2]);
        assertEquals(-4,numbers[3]);
        assertEquals(-1,numbers[4]);
    }

    @Test
    public void partition2Test(){
        int[] numbers = {5, 1, 4, 9, 3};
        QuickSort.partition2(numbers,0,4);
        assertEquals(3,numbers[0]);
        assertEquals(1,numbers[1]);
        assertEquals(4,numbers[2]);
        assertEquals(5,numbers[3]);
        assertEquals(9,numbers[4]);
    }

    @Test
    public void partition2_with_ascending_input(){
        int[] numbers = {1, 2, 3, 4, 5};
        QuickSort.partition2(numbers,0,4);
        assertEquals(1,numbers[0]);
        assertEquals(2,numbers[1]);
        assertEquals(3,numbers[2]);
        assertEquals(4,numbers[3]);
        assertEquals(5,numbers[4]);
    }

    @Test
    public void partition2_with_descending_input(){
        int[] numbers = {-1, -2, -3, -4, -5};
        QuickSort.partition2(numbers,0,4);
        assertEquals(-5,numbers[0]);
        assertEquals(-2,numbers[1]);
        assertEquals(-3,numbers[2]);
        assertEquals(-4,numbers[3]);
        assertEquals(-1,numbers[4]);
    }
}
