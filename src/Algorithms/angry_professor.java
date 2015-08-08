import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int x=0; x<t; x++){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] a = new int[n];
            
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            
            int count = 0;
            for(int i=0; i<n; i++){
                if(a[i] <= 0)
                    count++;
            }
            
            if(count >= p)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}