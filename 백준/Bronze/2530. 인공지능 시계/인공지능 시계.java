import java.io.*;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int time = Integer.parseInt(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    s += time % 60;
    m += time / 60 % 60;
    h += time / 3600;

    if (s >= 60) {
      s -= 60;
      m += 1;
    }
    if (m >= 60) {
      m -= 60;
      h += 1;
    }
    if (h >= 24) {
      h %= 24;
    }
    bw.write(h + " " + m + " " + s + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}