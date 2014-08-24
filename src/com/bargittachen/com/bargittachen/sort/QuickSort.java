package com.bargittachen.com.bargittachen.sort;

/**
 * QuickSort
 * separate the records into two parts, one part less than the pivot, the other part greater than the pivot
 * repeat the partition recursively till all records are sorted
 */
public class QuickSort {

    public static void sort(int[] records, int low, int high){
        int pivotIndex;
        if (low < high){
            pivotIndex = partition2(records, low, high);
            sort(records, low, pivotIndex - 1);
            sort(records, pivotIndex + 1, high);
        }
    }
    /**
     * Partition separates the records into two parts, if records[high] < pivot, it will be swapped with records[low], and vice versa
     * @param records input array
     * @param low pointer starts from the beginning of the records
     * @param high pointer starts from the end of the records
     * @return the index of pivot
     */
    public static int partition(int[] records, int low, int high){
        if(low > records.length - 1|| high > records.length - 1) {
            throw new IllegalArgumentException();
        }
        int pivot = records[low];
        while(low < high){
            while (records[high] > pivot  && low < high){
                high--;
            }
            swap(records, low, high);
            while (records[low] < pivot  && low < high){
                low++;
            }
            swap(records, low, high);
        }
        return low;

    }

    /**
     * optimized partition.
     * Either records[low] or records[high] will point to pivot in each iteration,
     * since the final position of pivot is where low == high, there is no need to swap
     * In this method, we just assign the value and place the pivot at the end
     * @param records input array
     * @param low pointer starts from the beginning of the records
     * @param high pointer starts from the end of the records
     * @return the index of pivot
     */
    public static int partition2(int[] records, int low, int high){
        if(low > records.length - 1|| high > records.length - 1) {
            throw new IllegalArgumentException();
        }
        int pivot = records[low];
        while(low < high){
            while (records[high] > pivot && low < high){
                high--;
            }
            records[low] = records[high];
            while (records[low] < pivot && low < high){
                low++;
            }
            records[high] = records[low];
        }
        records[low] = pivot;
        return low;

    }

    public static void swap(int[] records, int index1, int index2) {
        int temp = records[index1];
        records[index1] = records[index2];
        records[index2] = temp;
    }

}
