package com.bargittachen;

import java.security.InvalidParameterException;

/**
 * Created by xichen on 8/10/14.
 * 查找二维整数数组种是否包含某一个整数
 * 数组从左至右递增，从上至下递增
 * {{2, 7, 8, 20},{4, 13, 17, 40},{5, 14, 19, 60},{6, 15, 30, 100}}
 */
public class VectorSearch {

    private int[][] array;
    private int row;
    private int col;
    public VectorSearch(int[][] array, int row, int col) throws InvalidParameterException {
        if(array == null || row < 0 || col < 0) {
            throw new InvalidParameterException("required");
        }
        this.array = array;
        this.row = row;
        this.col = col;
    }

    public boolean quickSearch2 (int number){
        int startCol = 0;
        int startRow = row -1;
        while (validCol(startCol) && validRow(startRow)){
            int target = array[startRow][startCol];
            if(target == number){
                return true;
            }else if(target > number){
                startRow--;
            }else{
                startCol++;
            }
        }

        return false;
    }
    public boolean quickSearch(int number){
        int startCol = col - 1;
        int startRow = 0;


        while(validCol(startCol) && validRow(startRow)){
            int target = array[startRow][startCol];
            if(target == number) {
                return true;
            }else if(target < number){
                startRow ++;
            }else {
                startCol--;
            }
        }

        return false;
    }

    private boolean validRow(int startRow) {
        return startRow > -1 && startRow < row;
    }

    private boolean validCol(int startCol) {
        return startCol > -1 && startCol < col;
    }

    public boolean search(int number) {
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(number == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
