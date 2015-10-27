import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> n1 = new ArrayList<Integer>();
        for(int i=0; i<a; i++){ n1.add(sc.nextInt()); }
        
        int b = sc.nextInt();
        List<Integer> n2 = new ArrayList<Integer>();
        for(int i=0; i<b; i++){ n2.add(sc.nextInt()); }
        
        Collections.sort(n1);
        Collections.sort(n2);
        
        //System.out.println(n1);
        //System.out.println(n2);
        
        List<Integer> miss_no = new ArrayList<Integer>();
        
        int i = 0, j = 0;
        while(i < n2.size()){
            if(j < n1.size()){
                int num2 = n2.get(i);
                int num1 = n1.get(j);
                
                if(num1 == num2){
                    i++; j++;
                }
                else {
                    if(!miss_no.contains(num2))
                        miss_no.add(num2);
                    i++;
                }
            }
            else {
                if(!miss_no.contains(n2.get(i)))
                    miss_no.add(n2.get(i));
                i++;    
            }
        }
        
        Collections.sort(miss_no);

        for (Integer num : miss_no) {
            System.out.print(num + " ");
        }
        
    }
}