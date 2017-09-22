/*
566. Reshape the Matrix 
 You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix. 
个数i/每行的个数为行数，i%每行个数为列数
*/

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length = nums.length;
        int height = nums[0].length;
        if(r*c != height*length){
            return nums;
        }
        int[][] res = new int[r][c];
        for(int i = 0; i < r*c; i++){
            res[i/c][i%c] = nums[i/height][i%height];
        }
        return res;
        
    }
}