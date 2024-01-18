import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    int[][] body = new int[N][N];
    int[] rank = new int[N];
    Arrays.fill(rank, 1);

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      body[i][0] = Integer.parseInt(st.nextToken());
      body[i][1] = Integer.parseInt(st.nextToken());
    }
    br.close();

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
          if (i != j && body[i][0] < body[j][0] && body[i][1] < body[j][1]) {
              rank[i]++;
          }
      }
  }

  StringBuilder sb = new StringBuilder();

  for (int i = 0; i < rank.length; i++) {
      sb.append(rank[i]).append(" ");
  }

    bw.write(String.valueOf(sb.toString()));
    bw.newLine();
    bw.close();
  }
}
