import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        String N = br.readLine();
        br.close();

        char[] digits = N.toCharArray();
        
        Arrays.sort(digits);
        StringBuilder ret = new StringBuilder(new String(digits));

        bw.write(ret.reverse().toString());
        bw.flush();
        bw.close();
    } 
}
