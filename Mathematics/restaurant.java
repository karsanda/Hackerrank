import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] p = new int[test];
        int[] l = new int[test];
        
        for(int i=0; i<test; i++){
            p[i] = sc.nextInt();
            l[i] = sc.nextInt();
        }
        
        for(int i=0; i<test; i++){
            int area = p[i]*l[i], pwr = 1, res = 0, result = 0, tmp = 0;
            
            while(area > res){
                res = pwr*pwr;
                if((area%res == 0) && (p[i]%pwr == 0) && (l[i]%pwr == 0)){
                    result = area/res;
                    //System.out.println("pwr: " + pwr + "   res: " + result);
                }
                pwr++;
            }
            
            System.out.println(result);
        }
    }
}