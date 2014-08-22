package com.bargittachen;

/**
 * 两个排序数组，A1，A2，A1的末尾又足够的空间容纳A2，实现一个函数，将A2中的所有元素插入到A1，并且所有的元素是排序的
 */
public class MergeSortedVectors {


    public static boolean Merge(int[] dest, int destLength, int[] source, int sourceLength) {
        if(dest == null || dest.length < destLength + sourceLength || dest.length < destLength) {
            return false;
        }
        if(source != null && source.length < sourceLength)
            return false;
        if(source == null)
            return true;
        int sourceIndex = sourceLength - 1;
        int destIndex = destLength - 1;
        int currentPosition = destLength + sourceLength - 1;
        while(sourceIndex > -1 && destIndex > -1){
            if(dest[destIndex] >= source[sourceIndex]){
                dest[currentPosition--] = dest[destIndex--];
            }else{
                dest[currentPosition--] = source[sourceIndex--];
            }
        }
        while (sourceIndex > -1){
            dest[currentPosition--] = source[sourceIndex--];
        }
        while (destIndex > -1){
            dest[currentPosition--] = dest[destIndex--];
        }
        return true;
    }
}
