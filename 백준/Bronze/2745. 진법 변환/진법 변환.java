import java.io.*;
import java.util.*;

public class Main  {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int ret = 0;
        int len = N.length();
        
        for (int i = 0; i < len; i++) {
            char c = N.charAt(i);
            int val;

            if (c >= '0' && c <= '9')
                val = c - '0';
            else
                val = c - 'A' + 10;

            ret = ret * B + val;
        }

        bw.write(ret + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
