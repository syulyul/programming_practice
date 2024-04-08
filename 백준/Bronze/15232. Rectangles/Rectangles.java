import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int R = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        bw.write("*");
      }
      bw.newLine();
    }
    br.close();
    bw.flush();
    bw.close();
  }
}