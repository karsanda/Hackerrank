import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=1; i<=n; i++){
           for(int j=n; j>0; j--){
               if(j>i){
                    System.out.print(" "); 
               }
               else{
                   System.out.print("#");
               }
           }
           System.out.print("\n");
        }
    }
}