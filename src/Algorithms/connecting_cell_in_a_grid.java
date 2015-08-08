import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int[][] checking= {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    static int count = 0;
    
    private static int findMaxNum(int[][] matrix, int row, int col){
        int [][] visited = new int[row][col];
        int maxNum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                dfs(matrix, visited, i, j, row, col);
                if(count > maxNum) maxNum = count;
                    count = 0;
            }
        }
        return maxNum;
    }
        
    private static void dfs(int[][] matrix, int[][] visited, int i, int j, int row, int col) {
        if(i<0 || i>=row || j<0 || j>=col) return;
        if(visited[i][j] == 1 || matrix[i][j] == 0) return;
        count++;
        visited[i][j] = 1;
        for(int a = 0; a < 8; a++){
            dfs(matrix, visited, i+checking[a][0], j+checking[a][1], row, col);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int max = findMaxNum(matrix, row, col);
		System.out.println(max);
    }
}