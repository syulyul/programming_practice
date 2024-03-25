import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int[] tmp = new int[end - start + 1];
            int idx = 0;
            for (int j = start - 1; j < end; j++) {
                tmp[idx++] = basket[j];
            }

            int bidx = start - 1;
            for (int j = idx - 1; j >= 0; j--) {
                basket[bidx++] = tmp[j];
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(basket[i] + " ");
        }
        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }
}
