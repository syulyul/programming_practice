import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  static ArrayList<ArrayList<Integer>> graph;
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // 그래프 초기화
    graph = new ArrayList<>();
    visited = new boolean[N + 1];
    for (int i = 0; i <= N; i++) {
      graph.add(new ArrayList<>());
    }

    // 간선 정보 입력
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      graph.get(u).add(v);
      graph.get(v).add(u);
    }

    int cnt = 0; // 연결 요소 개수 카운트
    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        dfs(i);
        cnt++;
      }
    }

    bw.write(cnt + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
  
  static void dfs(int node) {
    visited[node] = true;
    for (int next : graph.get(node)) {
      if (!visited[next]) {
        dfs(next);
      }
    }
  }
}
