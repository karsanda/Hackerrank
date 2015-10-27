import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3]; int[] b = new int[3]; int fine = 0;
        for(int i=0; i<a.length; i++){ a[i]=sc.nextInt(); }
        for(int i=0; i<a.length; i++){ b[i]=sc.nextInt(); }
        
        if(a[0]<b[0] && a[1]==b[1] && a[2]==b[2] || (a[0]>b[0] && a[2]<b[2]) || (a[0]>b[0] && a[1]<b[1])){
            fine=0;
        }
        else if(a[0]>b[0] && a[1]==b[1]){
            fine=(a[0]-b[0])*15;
        }
        else if(a[1] > b[1] && a[2] == b[2]){
            fine=(a[1]-b[1])*500;
        }
        else if(a[2] > b[2]){
            fine=10000;
        }
        System.out.print(fine);
    }
}