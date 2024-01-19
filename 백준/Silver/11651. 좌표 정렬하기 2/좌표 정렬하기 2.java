import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    String[][] arr = new String[N][2];
    
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = st.nextToken();
      arr[i][1] = st.nextToken();
    }

    Arrays.sort(arr, (a, b) -> {
      int compare = Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
      if (compare == 0) {
        compare = Integer.compare(Integer.parseInt(a[0]),Integer.parseInt(b[0]));
      }
      return compare;
    });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}
