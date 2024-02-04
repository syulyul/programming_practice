import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      int[] num = new int[N];
      for (int i = 0; i < N; i++) {
        num[i] = Integer.parseInt(st.nextToken());
      }

      int[] sum = new int[100001];
      sum[0] = 0;
      for (int i = 1; i <= N; i++) {
        sum[i] = sum[i - 1] + num[i - 1];
      }

      for (int i = 0; i < M; i++) {
        st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int ret = sum[num2] - sum[num1 - 1];
        bw.write(ret + "\n");
      }
      br.close();
      bw.close();
    }
}
