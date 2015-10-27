import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 1;
        for(int i=0; i<t; i++){
            int n = sc.nextInt()-1;
            int[] r = new int[n];
            
            for(int j=0; j<n; j++){
                r[j] = sc.nextInt();
            }
            
            int res = 1;
            while(n-- > 0){
                res = (res * r[n])%1234567;
            }
            System.out.println(res);
        }
    }
}