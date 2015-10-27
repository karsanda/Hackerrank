import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        
        for(int i=0; i<t; i++){
            int m = cs.nextInt(), f = cs.nextInt();
            int[] c = new int [f];
            for (int a = 0; a < f; a++) { 
                c[a] = cs.nextInt(); 
            }
            for(int a = 0; a<f; a++){
                for(int b = a; b<f; b++) {
                    if((a != b) && (c[a] + c[b] == m))
                        System.out.println((a+1) + " " + (b+1));
                }
            }
        }
    }
}