import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  static int[] dy = { -1, 0, 1, 0 };
  static int[] dx = { 0, 1, 0, -1 };
  static int[][] box;
  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    box = new int[N][M];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        box[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    bw.write(bfs(N, M) + "\n");
    bw.newLine();
    bw.flush();
    bw.close();
  }

  static int bfs(int N, int M) {
    Queue<int[]> queue = new LinkedList<>();

    // 익은 토마토가 있는 위치를 queue에 넣음
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (box[i][j] == 1) {
          queue.offer(new int[] { i, j });
        }
      }
    }

    while (!queue.isEmpty()) {
      int[] tomato = queue.poll();
      int x = tomato[0];
      int y = tomato[1];

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < N && ny >= 0 && ny < M && box[nx][ny] == 0) {
          box[nx][ny] = box[x][y] + 1;
          queue.offer(new int[] { nx, ny });
        }
      }
    }

    int maxDay = 0;

    // 토마토가 모두 익는 최소 일수 계산
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (box[i][j] == 0) {
          return -1;
        }
        maxDay = Math.max(maxDay, box[i][j]);
      }
    }

    return maxDay - 1; // 시작일은 1이므로 -1을 해줌
  }
}
