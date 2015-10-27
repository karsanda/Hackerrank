import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.next());
        BigInteger b2 = new BigInteger(sc.next());
        BigInteger add = b1.add(b2);
        BigInteger multiply = b1.multiply(b2);
        
        System.out.println(add);
        System.out.println(multiply);
    }
}