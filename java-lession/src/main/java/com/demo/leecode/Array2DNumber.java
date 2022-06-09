package com.demo.leecode;

/**
 * 2d array find number
 */
public class Array2DNumber {


    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length -1, j = 0;
        while(i<=matrix.length-1 && j>=0){
            if (matrix[i][j] > target) {
                j--;
            }
            if (matrix[i][j] < target) {
                j++;
            }
            if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for(int i = 0; i<=array.length -1;i++){
           int[] a = new int[5];
           for (int j = 0; j<= array[0].length -1;j++){
               a[j] = 6+j;
               System.out.print(6+j+",");
           }
            System.out.println();
           array[i] = a;
        }
    }
}
