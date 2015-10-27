import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0, neg = 0, zer = 0;
        for(int x=0; x<n; x++){
            int num = sc.nextInt();
            if(num > 0) pos++;
            else if(num < 0) neg++;
            else zer++;
        }
        float frac_pos = (float) pos / (float) n, frac_neg = (float) neg / (float) n, frac_zer = (float) zer / (float) n;
        System.out.printf("%.3f\n", frac_pos);
        System.out.printf("%.3f\n", frac_neg);
        System.out.printf("%.3f\n", frac_zer);
    }
}