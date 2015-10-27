import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static boolean isPalindrome(char[] text, int a, int b){
        for(int i=a, j=b-1; i<j; ++i, --j){
            if (text[i] != text[j]) return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int a=0; a<test; a++){
            char[] text = sc.next().toCharArray();
            int n = text.length, c = -1;
            for(int i=0, j=n-1; i<j; ++i, --j){
                if(text[i] != text[j]){
                    c = isPalindrome(text, i+1, j+1) ? i : j;
                    break;
                }
            }
            System.out.println(c);
        }
    }
}
