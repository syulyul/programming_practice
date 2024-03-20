import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int R1 = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());

    bw.write(2 * S - R1 + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
