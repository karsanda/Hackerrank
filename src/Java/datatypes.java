import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        String x=null;

        try{
            DataInputStream dis = new DataInputStream(System.in);
            String[] s;
            int i = 0, u = 0;
            x = dis.readLine();
            int z = Integer.parseInt(x);
            s = new String[z];

            while(z-- != 0) { s[i++] = dis.readLine(); }
            while(i-- != 0) { check(s[u++]); }
        }
        catch(Exception w){}
    }

    public static void check(String s) {
        switch(parsing(s)) {
            case 4: System.out.println(s + " can be fitted in:\n* byte\n* short\n* int\n* long"); break;
            case 3: System.out.println(s + " can be fitted in:\n* short\n* int\n* long"); break;
            case 2: System.out.println(s + " can be fitted in:\n* int\n* long"); break;
            case 1: System.out.println(s + " can be fitted in:\n* long"); break;
            default: System.out.println(s + " can't be fitted anywhere."); break;
        }
    }

    public static int parsing(String s) {
        try{ byte x = Byte.parseByte(s); return 4; } catch(Exception e){}
        try{ Short x = Short.parseShort(s); return 3; } catch(Exception e){}
        try{ int x = Integer.parseInt(s); return 2; } catch(Exception e){}
        try{ Long x = Long.parseLong(s); return 1; } catch(Exception e){}
        return 0;
    }
}