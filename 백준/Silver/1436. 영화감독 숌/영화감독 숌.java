import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int cnt = 0;
    int num = 666;

    while (true) {
      if (String.valueOf(num).contains("666")) {
          cnt++;
      }

      if (cnt == n) {
        bw.write(String.valueOf(num));
        break;
      }
      num++;
    }
    bw.newLine();
    bw.flush();
  }
}
