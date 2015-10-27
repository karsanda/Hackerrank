import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toCharArray();
        char[] s2 = sc.next().toCharArray();
        int[] count_s1 = new int[26];
        int[] count_s2 = new int[26];
        
        for(char c : s1){ count_s1[c - 'a']++; }
        for(char c : s2){ count_s2[c - 'a']++; }
        
        int c = 0;
        for(int i=0; i<26; i++){ c += Math.abs(count_s1[i] - count_s2[i]); }
        System.out.println(c);
    }
}