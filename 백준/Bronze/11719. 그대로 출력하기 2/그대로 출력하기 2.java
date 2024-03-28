import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    String s;
    while ((s = br.readLine()) != null) {
      bw.write(s + "\n");
      bw.flush();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
