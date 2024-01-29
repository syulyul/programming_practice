import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    // int size = (int) Math.pow(2, N);
    int answer = recursiveZ(N, r, c, 0, 0);

    bw.write(answer + "\n");

    br.close();
    bw.close();
  }
  
  public static int recursiveZ(int N, int r, int c, int startRow, int startCol) {
    if (N == 0) {
      return 0;
    }
    
    int halfSize = (int) Math.pow(2, N - 1);
    int cellSize = (int) Math.pow(halfSize, 2);

    if (r < startRow + halfSize && c < startCol + halfSize) {
      return recursiveZ(N - 1, r, c, startRow, startCol);
    } else if (r < startRow + halfSize && c >= startCol + halfSize) {
      return cellSize + recursiveZ(N - 1, r, c, startRow, startCol + halfSize);
    } else if (r >= startRow + halfSize && c < startCol + halfSize) {
      return 2 * cellSize + recursiveZ(N - 1, r, c, startRow + halfSize, startCol);
    } else {
      return 3 * cellSize + recursiveZ(N - 1, r, c, startRow + halfSize, startCol + halfSize);
    }
  }
}
