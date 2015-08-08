import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            long h = 0, v = 0;
            int s = sc.nextInt();
            for(int j=1; j<=s; j++){
                if(j%2 != 0) h++;
                else v++;
            }
            
            System.out.println(Math.abs(h*v));
        }
    }
}