import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int[][] point = new int[3][3];
    StringTokenizer st = null;
    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      point[i][0] = Integer.parseInt(st.nextToken());
      point[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(point, Comparator.comparingInt(a -> a[0]));
    int x = (point[0][0] == point[1][0]) ? point[2][0] : (point[0][0] == point[2][0]) ? point[1][0] : point[0][0];
    
    Arrays.sort(point, Comparator.comparingInt(a -> a[1]));
    int y = (point[0][1] == point[1][1]) ? point[2][1] : (point[0][1] == point[2][1]) ? point[1][1] : point[0][1];

    bw.write(x + " " + y + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
