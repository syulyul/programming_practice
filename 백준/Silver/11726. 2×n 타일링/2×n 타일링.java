import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());

      bw.write(tiling(n) + "\n");
      br.close();
      bw.close();
    }
    
    public static int tiling(int n) {
      if (n == 1) {
        return 1;
      } else if (n == 2) {
        return 2;
      }

      int[] dp = new int[n + 1];
      dp[1] = 1;
      dp[2] = 2;
      for (int i = 3; i <= n; i++) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
      }
      return dp[n];
    }
}
