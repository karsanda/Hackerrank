import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        String[] token = result.split("[^a-zA-Z]");
        int num = 0;
        for (int x = 0; x < token.length; ++x) {
            if(token[x].length() > 0)
                num++;
        }
        System.out.println(num);
        for (int x = 0; x < token.length; ++x) {
            if(token[x].length() > 0)
                System.out.println(token[x]);
        }
    }
}