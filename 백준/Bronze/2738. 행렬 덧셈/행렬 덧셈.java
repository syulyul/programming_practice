import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        A[i][j] += Integer.parseInt(st.nextToken());
      }
    }

    int[][] B = new int[N][M];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        B[i][j] += Integer.parseInt(st.nextToken());
      }
    }

    int[][] sum = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sum[i][j] = A[i][j] + B[i][j];
        bw.write(sum[i][j] + " ");
      }
      bw.newLine();
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
