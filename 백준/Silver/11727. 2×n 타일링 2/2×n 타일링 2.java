import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(br.readLine());

    int[] dp = new int[n + 1];
    dp[1] = 1;
    if (n >= 2) {
      dp[2] = 3;
    }
    
    for (int i = 3; i <= n; i++) {
      dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
    }

    bw.write(dp[n] + "\n");
    br.close();
    bw.close();
  }
}
