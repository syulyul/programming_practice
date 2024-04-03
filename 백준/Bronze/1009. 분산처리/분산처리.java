import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int T = Integer.parseInt(br.readLine());
    int a = 0;
    int b = 0;
    StringTokenizer st = null;
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      
      int ret = 1;
      for (int j = 0; j < b; j++) {
        ret *= a; // a를 b번 곱함
        ret %= 10; // 나머지를 구하여 10으로 나눈 나머지를 구함
      }
      bw.write(((ret % 10 == 0) ? 10 : ret % 10) + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}