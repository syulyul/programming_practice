import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        long[] f = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            for ( int j = i; j <= N; j += i) {
                f[j] += i;
            }
        }

        long g = 0;
        for (int i = 1; i <= N; i++) {
            g += f[i];
        }

        bw.write(String.valueOf(g));
        bw.flush();
        br.close();
        bw.close();
    }
}