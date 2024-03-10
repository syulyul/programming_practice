import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  private static int[] selected;
  private static int N, M;
  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    selected = new int[M];
    dfs(1, 0);

    bw.flush();
    br.close();
    bw.close();
  }

  private static void dfs(int start, int depth) throws IOException {
    if (depth == M) {
      for (int num : selected) {
        bw.write(num + " ");
      }
      bw.newLine();
      return;
    }

    for (int i = start; i <= N; i++) {
      selected[depth] = i;
      dfs(i + 1, depth + 1);
    }
  }
}
