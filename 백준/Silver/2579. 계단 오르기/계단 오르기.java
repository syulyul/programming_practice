import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    int stairs = Integer.parseInt(br.readLine());
    int[] score = new int[stairs + 1];
    int[] dp = new int[stairs + 1];

    for (int i = 1; i <= stairs; i++) {
      score[i] = Integer.parseInt(br.readLine());
    }
    br.close();

    dp[1] = score[1];
    if (stairs > 1) {
      dp[2] = score[1] + score[2];
    }
    for (int i = 3; i <= stairs; i++) {
      dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
    }
    bw.write(dp[stairs] + "\n");
    bw.close();
  }
}