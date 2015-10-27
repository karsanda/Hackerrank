import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n;){
            sb.append((n-i) + "\n");
            while (++i<n && arr[i-1] == arr[i]){}
        }
        
        System.out.print(sb);
    }
}