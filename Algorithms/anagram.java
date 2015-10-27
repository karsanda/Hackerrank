import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int i=0; i<test; i++){
            String text = sc.next();
            int count=0;
            if(text.length()%2 != 0){
                System.out.println(-1);
                continue;
            }else{
                char[] s = text.toCharArray();
                char[] s1 = Arrays.copyOfRange(s, 0, text.length()/2);
                char[] s2 = Arrays.copyOfRange(s, text.length()/2, text.length());
                int[] letters = new int[26];
                
                for(char c: s2){
                    int tmp = c-'a';
                    //System.out.println(tmp);
                    letters[tmp]++;
                    //System.out.println(Arrays.toString(letters));
                }
 
                for(char c: s1){
                    int tmp = c-'a';
                    //System.out.println(tmp);
                    if(letters[tmp]>0){
                        letters[tmp]--;
                    }
                    //System.out.println(Arrays.toString(letters));
                }
 
                for(int c:letters){
                    count = count + Math.abs(c);
                    //System.out.println(count);
                }
            }
            System.out.println(count);
        }
    }
}