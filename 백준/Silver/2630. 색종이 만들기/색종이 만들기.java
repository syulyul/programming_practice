import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  static int[][] squares;
  static int white = 0;
  static int blue = 0;
 
  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    squares = new int[N][N];
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        squares[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    cutSquares(N, 0, 0);

    bw.write(white + "\n");
    bw.write(blue + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
  
  public static void cutSquares(int size, int row, int col) throws IOException {
    if (checkColor(size, row, col)) {
      if (squares[row][col] == 0) {
        white++;
      } else {
        blue++;
      }
      return;
    }

    int half = size / 2;
    cutSquares(half, row, col); // 왼쪽 위
    cutSquares(half, row, col + half); // 오른쪽 위
    cutSquares(half, row + half, col); // 왼쪽 아래
    cutSquares(half, row + half, col + half); // 오른쪽 아래
  }

  private static boolean checkColor(int size, int row, int col) {
    for (int i = row; i < row + size; i++) {
      for (int j = col; j < col + size; j++) {
        if (squares[i][j] != squares[row][col]) {
          return false;
        }
      }
    }
    return true;
  }
}
