import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int ret = 1;

    for (int i = 1; i <= N; i++) {
      ret *= i;
    }
    
    for (int i = 1; i <= M; i++) {
      ret /= i;
    }

    for (int i = 1; i <= N - M; i++) {
      ret /= i;
    }

    bw.write(String.valueOf(ret));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}
