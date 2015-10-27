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
            String text = sc.next();
            int flag = 0;
            for(int j=0; j<text.length(); j++){
                if(j != text.length()-1){
                    if(text.charAt(j) == text.charAt(j+1)){
                        flag++;
                    }
                }
            }
            System.out.println(flag);
        }
    }
}