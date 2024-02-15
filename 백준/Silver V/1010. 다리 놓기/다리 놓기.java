import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  static long[][] dp = new long[30][30]; // 메모이제이션을 위한 배열
  public static void main(String[] args) throws Exception {
    int T = Integer.parseInt(br.readLine());

    // 메모이제이션 초기화
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {
        dp[i][j] = -1;
      }
    }

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      bw.write(comb(M, N) + "\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
  
  private static long comb(int m, int n) {
    if (n == 0 || m == n) return 1;
    if (dp[m][n] != -1) return dp[m][n];

    // 메모이제이션을 활용하여 중복 계산을 피함
    dp[m][n] = comb(m - 1, n - 1) + comb(m - 1, n);
    return dp[m][n];
  }
}