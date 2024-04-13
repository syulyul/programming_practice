import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    String str = "";
    while ((str = br.readLine()) != "#") {
      String s = str.toLowerCase();
      if (s.equals("#"))
        break;
      int cnt = 0;
      for (int i = 0; i < s.length(); i++) {
        char alpha = s.charAt(i);
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
          cnt++;
        } else {
          continue;
        }
      }
      bw.write(cnt + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}