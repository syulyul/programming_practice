import java.io.*;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    char[][] castle = new char[N][M];
    for (int i = 0; i < N; i++) {
      String row = br.readLine();
      for (int j = 0; j < M; j++) {
        castle[i][j] = row.charAt(j);
      }
    }

    // 각 행에 최소 한 명의 경비원이 있는지 확인하여 추가해야 하는 경비원 수 계산
    int need1 = 0;
    for (int i = 0; i < N; i++) {
      boolean hasGuard = false; // 현재 행에 경비원이 있는지 여부를 나타내는 변수
      for (int j = 0; j < M; j++) {
        if (castle[i][j] == 'X') {
            hasGuard = true; // 현재 행에 경비원이 있음을 표시
            break;
        }
      }
      // 현재 행에 경비원이 없는 경우 추가 경비원 수 증가
      if (!hasGuard) {
          need1++;
      }
    }

    int need2 = 0;
    // 각 열에 최소 한 명의 경비원이 있는지 확인하여 추가해야 하는 경비원 수 계산
    for (int j = 0; j < M; j++) {
      boolean hasGuard = false; // 현재 열에 경비원이 있는지 여부를 나타내는 변수
      for (int i = 0; i < N; i++) {
        if (castle[i][j] == 'X') {
            hasGuard = true; // 현재 열에 경비원이 있음을 표시
            break;
        }
      }
      // 현재 열에 경비원이 없는 경우 추가 경비원 수 증가
      if (!hasGuard) {
        need2++;
      }
    }
    bw.write(Math.max(need1, need2) + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}