import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int test = sc.nextInt();
        
        int[] width = new int[length];
        for(int i=0; i<length; i++){
            width[i] = sc.nextInt();
        }
        
        for(int x=0; x<test; x++){
            int start = sc.nextInt();
            int exit = sc.nextInt();
            
            int temp = width[start];
            for(int i=start+1; i<=exit; i++){
                if(temp > width[i])
                    temp = width[i];
            }
            
            System.out.println(temp);
        }
        
    }
}