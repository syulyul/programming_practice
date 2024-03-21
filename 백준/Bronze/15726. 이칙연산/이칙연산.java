import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    double ret1 = (double) A / B * C;
    double ret2 = (double) B / C * A;
    double maxRet = Math.max(ret1, ret2);

    bw.write((int) maxRet + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
