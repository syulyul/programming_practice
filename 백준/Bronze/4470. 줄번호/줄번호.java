import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      bw.write(i + 1 + ". " + br.readLine());
      bw.newLine();
    }
    br.close();
    bw.flush();
    bw.close();
  }
}