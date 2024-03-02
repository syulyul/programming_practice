import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
  public static void main(String[] args) throws IOException {
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0) {
        break;
      } else {
        if (a > b) {
          bw.write("Yes\n");
        } else {
          bw.write("No\n");
        }
      }
    }
    br.close();
    bw.close();
  }
}
