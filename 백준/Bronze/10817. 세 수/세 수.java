import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] num = new int[3];
    for (int i = 0; i < 3; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(num);

    bw.write(num[1] + "\n");

    bw.flush();
    br.close();
    bw.close();
  }
}
