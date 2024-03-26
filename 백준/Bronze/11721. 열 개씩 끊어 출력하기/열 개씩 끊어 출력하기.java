import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    String str = br.readLine();
    for (int i = 0; i < str.length(); i += 10) {
      if (i + 10 < str.length()) {
          bw.write(str.substring(i, i + 10) + "\n");
      } else {
          bw.write(str.substring(i) + "\n");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
