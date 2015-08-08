import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clock = sc.next();
        String parse = clock.substring(0, clock.length()-2);
        
        if(clock.contains("PM")){
            int hour = Integer.parseInt(clock.substring(0,2));
            if(hour == 12){
                System.out.print(parse); 
            }
            else{
                hour = hour + 12;
                String convert = hour + clock.substring(2, clock.length()-2);
                System.out.print(convert);   
            }
        }
        else if(clock.contains("AM")){
            int hour = Integer.parseInt(clock.substring(0,2));
            if(hour == 12){
                String convert = "00" + clock.substring(2, clock.length()-2);
                System.out.print(convert);
            }
            else{
                System.out.print(parse);   
            }
        }
    }
}