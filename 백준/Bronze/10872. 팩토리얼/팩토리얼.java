import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    
    int ret = 1;
    for (int i = 1; i <= N; i++) {
      ret *= i;
    }

    bw.write(ret + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
