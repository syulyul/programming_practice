import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += Integer.parseInt(br.readLine());
    }
    bw.write(sum + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
