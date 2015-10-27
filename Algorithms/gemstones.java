import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] rock = new String[n];
        int f=0, c=0;
        char ch;
        
        for(int i=0; i<n; i++){
            rock[i] = sc.next();
        }
        
        for(int i=0; i<rock[0].length(); i++){
            f = 0;
            ch = rock[0].charAt(i);
            
            for(int j=1; j<n; j++){
                for(int k=0; k<rock[j].length(); k++){
                    if(ch == rock[j].charAt(k)){
                        rock[j] = rock[j].substring(0,k) + rock[j].substring(k+1);
                        f++; break;
                    }
                }
            }
            if(f == n-1) c++;
        }
        System.out.println(c);
    }
}