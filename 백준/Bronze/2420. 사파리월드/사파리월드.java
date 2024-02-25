import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    long N = Long.parseLong(st.nextToken());
    long M = Long.parseLong(st.nextToken());

    long diff = Math.abs(N - M);

    bw.write(diff + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
