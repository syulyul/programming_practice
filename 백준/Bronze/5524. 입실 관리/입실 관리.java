import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String name = br.readLine();
      bw.write(name.toLowerCase() + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}