import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0) 
                break;

            if (B % A == 0)
                bw.write("factor\n");
            else if (A % B == 0)
                bw.write("multiple\n");
            else if (B % A != 0 && A % B != 0)
                bw.write("neither\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
