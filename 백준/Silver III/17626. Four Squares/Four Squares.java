import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws Exception {
    int n = Integer.parseInt(br.readLine()); // 입력 받은 자연수

    // dp 배열 초기화
    int[] dp = new int[n + 1];
    
    // 주어진 자연수를 제곱수의 합으로 표현하는 경우의 수 계산
    for (int i = 1; i * i <= n; i++) {
      dp[i * i] = 1;
    }

    // dp 배열 채우기
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j * j <= i; j++) {
        if (dp[i] == 0 || dp[i - j * j] + 1 < dp[i]) {
          dp[i] = dp[i - j * j] + 1;
        }
      }
    }

    // 결과 출력
    bw.write(dp[n] + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
