import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void sort(BigDecimal[] Ar){
        int idx = 0;
        for(int i = 1; i < Ar.length; i++) {
            idx++;
            for(int j = 0; j <= idx; j++) {
                if(Ar[j].compareTo(Ar[idx]) == -1) {
                    BigDecimal temp = new BigDecimal('0');
                    temp = Ar[idx];
                    Ar[idx] = Ar[j];
                    Ar[j] = temp;
                } else continue;
            }
        }
        for(int x = 0; x < Ar.length; x++) {
            String a = Ar[x].toPlainString();
            if(a.indexOf('0') == 0 && a.indexOf('.') == 1) a = a.substring(1, a.length());
            System.out.println(a);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal[] Ar = new BigDecimal[n];
        for(int i = 0; i < Ar.length; i++) Ar[i] = new BigDecimal(sc.next());
        sort(Ar);
    }
}