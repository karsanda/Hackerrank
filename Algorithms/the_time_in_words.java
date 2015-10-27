import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String[] hours = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] first_minutes = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] second_minutes = {"ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if(m <= 30){
            if(m == 0)
                System.out.print(hours[h-1] + " o' clock");
            else if(m < 10){
                if(m == 1)
                    System.out.print("one minute past " + hours[h-1]);
                else
                    System.out.print(first_minutes[m-1] + " minutes past " + hours[h-1]);
            }
            else if(m <= 20){
                if(m == 15)
                    System.out.print("quarter past " + hours[h-1]);
                else
                    System.out.print(second_minutes[m-10] + " minutes past " + hours[h-1]);
            }
            else if(m < 30)
                System.out.print("twenty " + first_minutes[m-21] + " minutes past " + hours[h-1]);
            else
                System.out.print("half past " + hours[h-1]);
        }
        else{
            m = 60 - m;
            if(m < 10){
                if(m == 1)
                    System.out.print("one minute to " + hours[h]);
                else
                    System.out.print(first_minutes[m-1] + " minutes to " + hours[h]);
            }
            else if(m <= 20){
                if(m == 15)
                    System.out.print("quarter to " + hours[h]);
                else
                    System.out.print(second_minutes[m-10] + " minutes to " + hours[h]);
            }
            else if(m < 30)
                System.out.print("twenty " + first_minutes[m-21] + " minutes to " + hours[h]);
        }
    }
}