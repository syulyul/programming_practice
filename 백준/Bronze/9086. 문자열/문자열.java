import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
      int T = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < T; i++) {
        String str = br.readLine();
        sb.append(str.charAt(0));
        sb.append(str.charAt(str.length() - 1) + "\n");
      }
      bw.write(sb + "\n");
      bw.flush();
      br.close();
      bw.close();
    }
}
