import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String min = str.substring(0, n), max = str.substring(0, n);
        
        for(int i = 1; i < str.length()-n+1; i++){
            if(str.substring(i, i+n).compareTo(min) < 0) min = (str.substring(i, i+n));
            if(str.substring(i, i+n).compareTo(max) > 0) max = (str.substring(i, i+n));
        } System.out.print(min + '\n' + max);
    }
}