import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    br.close();
    
    int[] dp = new int[N + 1];
    dp[1] = 0; // 1은 이미 1이므로 연산 횟수가 0입니다.

    // 연산 횟수 갱신
    for (int i = 2; i <= N; i++) {
      dp[i] = dp[i - 1] + 1; // 1을 빼는 경우
      if (i % 2 == 0)
        dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누는 경우
      if (i % 3 == 0)
        dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누는 경우
    }
    bw.write(dp[N] + "\n");
    bw.close();
  }
}
