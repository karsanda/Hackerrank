import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); String s = sc.next(); int k = sc.nextInt();
        
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if((int)c >= 97 && (int)c <= 122){
                int x = ((((int)c - 'a') + k)%26) + 'a';
                System.out.print(Character.toChars(x));
            }
            else if((int)c >= 65 && (int)c <= 90){
                int x = ((((int)c - 'A') + k)%26) + 'A';
                System.out.print(Character.toChars(x));
            }
            else System.out.print(c);
        }
    }
}