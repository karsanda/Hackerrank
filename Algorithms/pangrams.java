import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); int flag=0;
        String text = reader.nextLine();
        text = text.toLowerCase();
        for(char a = 'a'; a <= 'z'; a++){
            if((text.indexOf(a) < 0) && (text.indexOf((char) (a + 32)) < 0)){
                continue;
            }
            else flag++;
        }
        if(flag == 26) System.out.print("pangram");
        else System.out.print("not pangram");
    }
}