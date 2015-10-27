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
            char[] s = sc.next().toCharArray();
            int[] a = new int[s.length];
            
            for(int b=0; b<s.length; b++){
                a[b] = s[b];
            }
            
            int count = 0;
            int n = a.length;
            for(int j=0, k=n-1; j<k; ++j, --k){
                if(a[j] != a[k]){
                    count += Math.abs(a[j]-a[k]);
                }
            }
            System.out.println(count);
        }
    }
}