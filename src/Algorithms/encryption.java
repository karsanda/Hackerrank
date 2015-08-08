import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        text = text.replace(" ", "");
        int text_length = text.length();
        int bil_pwr = 1; double res_pwr = 0;
        
        while(res_pwr < text_length){
            bil_pwr += 1;
            res_pwr = Math.pow(bil_pwr, 2);
        }

        String[][] grid = new String[bil_pwr][bil_pwr];
        int index = 0;
        
        for(int i=0; i<bil_pwr; i++){
            for(int j=0; j<bil_pwr; j++){
                if(index <= (text_length-1)){
                    grid[i][j] = Character.toString(text.charAt(index));
                    index++;
                }
                else break;
            }
        }
        
        for(int i=0; i<bil_pwr; i++){
            for(int j=0; j<bil_pwr; j++){
                if(grid[j][i] != null) System.out.print(grid[j][i]);
            }
            System.out.print(" ");
        }
    }
}