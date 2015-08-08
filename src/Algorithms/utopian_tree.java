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
            int c = sc.nextInt();
            if(c == 0) System.out.println(1);
            else{
                int h = 1;
                for (int j=1; j<=c; j++) {
                    if(j%2 == 0){
                        h++;
                        //System.out.println(j + "   " + h);
                    }
                    else{
                        h = h*2;
                        //System.out.println(j + "   " + h);
                    }
                }
                System.out.println(h);
            }
               
        }
    }
}