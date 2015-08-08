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
            int n = sc.nextInt();
            int ans = ((n-1)*n)/2;
            System.out.println(ans);
        }
    }
}