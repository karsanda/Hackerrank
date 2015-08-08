import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int x=0; x<n; x++){
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();
            
            int[] c1 = new int[26];
            int[] c2 = new int[26];
            
            for(char c : s1){ c1[c - 'a']++; }
            for(char c : s2){ c2[c - 'a']++; }
            
            int counter = 0;
            for(int i=0; i<26; i++){
                if(c1[i] >= 1 && c2[i] >= 1){
                    counter++;
                    break;
                }
            }
            
            if(counter == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}