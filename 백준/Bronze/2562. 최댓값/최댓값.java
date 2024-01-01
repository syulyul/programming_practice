import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] num = new int[9];
    int max = 0;
    int idx = 0;
    
    for (int i = 0; i < 9; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < 9; i++) {
      if (num[i] > max) {
        max = num[i];
        idx = i + 1;
      }
    }

    bw.write(String.valueOf(max));
    bw.newLine();
    bw.write(String.valueOf(idx));
    bw.newLine();

    bw.flush();
    bw.close();
  }
}
