import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    bw.write((int) (N * (1 - 0.22)) + " ");
    bw.write((int) (N * 0.8 + N * 0.2 * (1 - 0.22)) + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}