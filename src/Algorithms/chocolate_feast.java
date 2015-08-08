import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int numChoc(int N, int C){
        return N / C;
    }
    private static int numWrap(int choco, int M){
        int res = 0;
        while(choco / M > 0){
            res += choco / M;
            choco = (choco / M) + (choco % M);
        } return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int N = in.nextInt(), C = in.nextInt(), M = in.nextInt(), total = 0;
            total = numChoc(N, C) + numWrap(numChoc(N, C), M);
            System.out.println(total);
        }
    }
}