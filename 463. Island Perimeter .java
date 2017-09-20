/**
463. Island Perimeter 
只算右边和下边是否有相邻方块，有的话减去2条边
**/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int height = grid[0].length;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < height; j++){
                if(grid[i][j] == 1){
                    perimeter += 4;
                
                    if(j < height-1 && grid[i][j+1] == 1){
                        perimeter -= 2;
                    }
                    if(i < grid.length-1 && grid[i+1][j] == 1){
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}