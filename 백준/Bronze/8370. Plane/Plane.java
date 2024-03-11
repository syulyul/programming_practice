import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n1 = Integer.parseInt(st.nextToken());
    int k1 = Integer.parseInt(st.nextToken());
    int n2 = Integer.parseInt(st.nextToken());
    int k2 = Integer.parseInt(st.nextToken());

    bw.write(n1 * k1 + n2 * k2 + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
