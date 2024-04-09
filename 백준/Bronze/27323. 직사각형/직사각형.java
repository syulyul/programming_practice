import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    bw.write(A * B + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}