import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken()); // 정점의 개수
      int M = Integer.parseInt(st.nextToken()); // 간선의 개수
      int V = Integer.parseInt(st.nextToken()); // 시작 정점 번호

      // 그래프 초기화
      graph = new ArrayList[N + 1];
      for (int i = 1; i <= N; i++) {
        graph[i] = new ArrayList<>();
      }

      // 간선 정보 입력
      for (int i = 0; i < M; i++) {
        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        graph[from].add(to);
        graph[to].add(from); // 양방향 간선
      }

      // 각 정점의 인접 정점 리스트 정렬 (번호가 작은 것부터 방문하기 위함)
      for (int i = 1; i <= N; i++) {
        Collections.sort(graph[i]);
      }

      // DFS와 BFS 수행 및 결과 출력
      visited = new boolean[N + 1];
      StringBuilder dfsRet = new StringBuilder();
      dfs(V, dfsRet);
      bw.write(dfsRet.toString() + "\n");

      visited = new boolean[N + 1];
      StringBuilder bfsRet = new StringBuilder();
      bfs(V, bfsRet);
      bw.write(bfsRet.toString() + "\n");

      br.close();
      bw.close();
    }

  public static void dfs(int v, StringBuilder ret) {
    visited[v] = true;

    ret.append(v).append(" ");

    for (int next : graph[v]) {
      if (!visited[next]) {
        dfs(next, ret);
      }
    }
  }

  public static void bfs(int v, StringBuilder ret) {
    Queue<Integer> queue = new LinkedList<>();
    visited[v] = true;
    queue.offer(v);

    while (!queue.isEmpty()) {
      int current = queue.poll();
      ret.append(current).append(" ");

      for (int next : graph[current]) {
        if (!visited[next]) {
            visited[next] = true;
            queue.offer(next);
        }
      }
    }
  }
}
