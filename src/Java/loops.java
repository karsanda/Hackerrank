import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 0; x < t; x++) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt(), total = 0;
            for(int i = 0; i < n; i++) {
                if(i == 0) total += (a + (Math.pow(2, i) * b));   
                else total += (Math.pow(2, i) * b);
                System.out.print(total + " ");
            } System.out.print("\n");
        }
    }
}