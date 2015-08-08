import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int x=0; x<t; x++){
            String ans = "NO";
            int n = sc.nextInt();
            int[] arr = new int[n];
            int total = 0;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            
            if(n == 1){
                ans = "YES";
                System.out.println(ans);
                continue;
            }
            else if(n == 2){
                System.out.println(ans);
                continue;
            }
            else{
                int l = 0;
                int r = total;
                for(int i=1; i<n-1; i++){    
                    l += arr[i-1];
                    r = total - arr[i] - l;
                    if(l == r) {
                        ans = "YES";
                        break;
                    }
                }
            }         
            
            System.out.println(ans);
        }
    }
}