import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] dx = { 1, -1, 0, 0 };
    private static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] campus = new char[N][M];
        int startX = -1, startY = -1;
        int peopleCnt = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                campus[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (campus[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }

        peopleCnt = bfs(campus, N, M, startX, startY);
        bw.write(peopleCnt == 0 ? "TT\n" : peopleCnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    private static int bfs(char[][] campus, int N, int M, int startX, int startY) {
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{ startX, startY });
        visited[startX][startY] = true;
        int peopleCnt = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && campus[nx][ny] != 'X') {
                    visited[nx][ny] = true;
                    queue.add(new int[]{ nx, ny });
                    if (campus[nx][ny] == 'P') {
                        peopleCnt++;
                    }
                }
            }
        }
        return peopleCnt;
    }
}
