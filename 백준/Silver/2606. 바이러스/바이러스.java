import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  static ArrayList<Integer>[] graph;
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    int computers = Integer.parseInt(br.readLine()); // 컴퓨터 개수
    int N = Integer.parseInt(br.readLine()); // 연결 컴퓨터 쌍의 개수

    // 그래프를 인접 리스트로 구현
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for (int i = 0; i <= computers; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken());
      int to = Integer.parseInt(st.nextToken());
      graph.get(from).add(to);
      graph.get(to).add(from);
    }

    int cnt = bfs(graph, computers);
    bw.write(cnt + "\n");

    br.close();
    bw.close();
  }

  public static int bfs(ArrayList<ArrayList<Integer>> graph, int computers) {
    boolean[] visited = new boolean[computers + 1];
    Queue<Integer> queue = new LinkedList<>();
    int cnt = 0; // 웜 바이러스에 걸린 컴퓨터 수

    queue.offer(1); // 1번 컴퓨터부터 시작
    visited[1] = true;

    while (!queue.isEmpty()) {
      int current = queue.poll();
      cnt++;

      // 현재 컴퓨터와 연결된 컴퓨터들 중 방문하지 않은 컴퓨터를 큐에 추가
      for (int next : graph.get(current)) {
        if (!visited[next]) {
          visited[next] = true;
          queue.offer(next);
        }
      }
    }
    return cnt - 1;
  }
}
