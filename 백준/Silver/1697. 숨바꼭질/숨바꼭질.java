import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    bw.write(bfs(N, K) + "\n");
    bw.flush();
    br.close();
    bw.close();
  }

  private static int bfs(int N, int K) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[100001];
    int[] time = new int[100001];

    queue.offer(N);
    visited[N] = true;
    time[N] = 0;

    while (!queue.isEmpty()) {
      int current = queue.poll();

      if (current == K) {
        return time[current];
      }

      if (current - 1 >= 0 && !visited[current - 1]) {
        queue.offer(current - 1);
        visited[current - 1] = true;
        time[current - 1] = time[current] + 1;
      }
      if (current + 1 <= 100000 && !visited[current + 1]) {
        queue.offer(current + 1);
        visited[current + 1] = true;
        time[current + 1] = time[current] + 1;
      }
      if (current * 2 <= 100000 && !visited[current * 2]) {
        queue.offer(current * 2);
        visited[current * 2] = true;
        time[current * 2] = time[current] + 1;
      }
    }

    return -1; // 동생을 찾지 못한 경우
  }
}
