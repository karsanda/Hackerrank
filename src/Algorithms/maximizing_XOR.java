import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int result = 0, temp = 0;
        
        for(int i=l; i<=r; i++){
            for(int j=i; j<=r; j++){
                temp = i^j;
                if(result < temp)result = temp;       
            }    
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
