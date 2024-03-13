import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  private static int N, M;
  private static int[] num, selected;
  private static boolean[] visited;
  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    num = new int[N];
    selected = new int[M];
    visited = new boolean[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(num);

    selected = new int[M];
    dfs(0);

    bw.flush();
    br.close();
    bw.close();
  }
  
  private static void dfs(int depth) throws IOException {
    if (depth == M) {
      for (int i = 0; i < M; i++) {
        bw.write(selected[i] + " ");
      }
      bw.newLine();
      return;
    }

    for (int i = 0; i < N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        selected[depth] = num[i];
        dfs(depth + 1);
        visited[i] = false;
      }
    }
  }
}
