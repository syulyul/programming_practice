import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      int sum = Integer.parseInt(br.readLine());

      int[] dp = new int[11];

      dp[1] = 1;
      dp[2] = 2;
      dp[3] = 4;

      for (int j = 4; j <= sum; j++) {
        dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
      }

      bw.write(dp[sum] + "\n");
    }
		
    br.close();
    bw.close();
  }
}
