import java.io.*;
import java.util.*;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  static int n, m;
  static int[][] map;
  static int[][] dist;
  static boolean[][] visited;
  static Queue<int[]> queue = new LinkedList<>();
  static int[] dx = {-1, 1, 0, 0};
  static int[] dy = { 0, 0, -1, 1 };

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    map = new int[n][m];
    dist = new int[n][m];
    visited = new boolean[n][m];

    int startX = 0, startY = 0;

    // 지도 입력
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
        if (map[i][j] == 2) {
          startX = i;
          startY = j;
        }
      }
    }

    // BFS를 통해 각 지점에서 목표 지점까지의 거리 계산
    bfs(startX, startY);

    // 결과 출력
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] == 0) {
          bw.write("0 ");
        } else if (!visited[i][j]) {
          bw.write("-1 ");
        } else {
          bw.write(dist[i][j] + " ");
        }
      }
      bw.newLine();
    }
    bw.flush();
    br.close();
    bw.close();
  }

  // BFS 수행
  static void bfs(int x, int y) {
    queue.offer(new int[] { x, y });
    visited[x][y] = true;

    while (!queue.isEmpty()) {
      int[] cur = queue.poll();
      int curX = cur[0];
      int curY = cur[1];

      for (int i = 0; i < 4; i++) {
        int nextX = curX + dx[i];
        int nextY = curY + dy[i];

        if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
          visited[nextX][nextY] = true;
          dist[nextX][nextY] = dist[curX][curY] + 1;
          queue.offer(new int[] { nextX, nextY });
        }
      }
    }
  }
}
