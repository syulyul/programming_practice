import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {

    int[] number = new int[3];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 3; i++) {
      number[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(number);
    for (int i = 0; i < 3; i++) {
      bw.write(number[i] + " ");
    }
    bw.newLine();
    bw.flush();
    br.close();
    bw.close();
  }
}
