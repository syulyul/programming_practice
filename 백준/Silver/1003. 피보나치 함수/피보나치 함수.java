import java.io.*;

public class Main {
  static int[] cnt0 = new int[41];
  static int[] cnt1 = new int[41];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    preFibonacci();
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      sb.append(cnt0[N]).append(" ").append(cnt1[N]).append("\n");
    }
    bw.write(sb.toString());
    br.close();
    bw.close();
  }
  
  public static void preFibonacci() {
    cnt0[0] = 1;
    cnt1[1] = 1;
    for (int i = 2; i <= 40; i++) {
      cnt0[i] = cnt0[i - 1] + cnt0[i - 2];
      cnt1[i] = cnt1[i - 1] + cnt1[i - 2];
    }
  }
}
