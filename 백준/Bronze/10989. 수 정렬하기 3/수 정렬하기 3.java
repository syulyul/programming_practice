import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {

    int N = Integer.parseInt(br.readLine());
    int[] num = new int[N];

    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(num);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(num[i]).append("\n");
    }
    bw.write(sb.toString());
    bw.close();
  }
}
