import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = 0;
        
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0; i<n; i++){ l.add(sc.nextInt()); }
        
        Collections.sort(l);
        int n1 = 0, n2 = 0;
        
        for(int i=0; i<l.size(); i++){
            n1 = (int) l.get(i);
            for(int j=i+1; j<l.size(); j++){
                n2 = (int) l.get(j);
                if(n1 < n2){
                    if(Math.abs(n1-n2) == k) c++;
                    if(Math.abs(n1-n2) > k) break;
                }
                else j=i;
            }
        }
        System.out.print(c);
    }
}
