import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  private static int N, M;
  private static boolean[] visited;
  private static int[] selected;
    
  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    selected = new int[M];
    visited = new boolean[N];
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

    for (int i = 0; i < N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        selected[depth] = i + 1;
        dfs(start + 1, depth + 1);
        visited[i] = false;
      }
    }
  }
  
}
