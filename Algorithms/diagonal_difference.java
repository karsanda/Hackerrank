import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d1 = 0, d2 = 0;
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) matrix[i][j] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j) d1 += matrix[i][j];
                if(j == (n-1)-i) d2 += matrix[i][j];
            }
        } System.out.print(Math.abs(d1-d2));
    }
}