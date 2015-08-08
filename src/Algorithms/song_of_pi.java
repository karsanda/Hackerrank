import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] PI = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,3};
        int test = sc.nextInt(); sc.nextLine();
        
        for(int x=0; x<test; x++) {
            String s = sc.nextLine();
            String[]parse_string = s.split(" ");
            int[] length = new int[parse_string.length];
            
            for(int i=0; i<parse_string.length; i++){
                length[i] = parse_string[i].length();        
            }
        
            int check = 1;
            for(int i=0; i<length.length; i++){
                if(length[i] != PI[i]){
                    check = 0;
                }
            }
        
            if(check == 1)
                System.out.println("It's a pi song.");
            else
                System.out.println("It's not a pi song.");
        }
    }
}