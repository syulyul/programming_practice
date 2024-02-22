import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
      String str = br.readLine();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
          sb.append((char)('a' + (str.charAt(i) - 'A')));
        } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
          sb.append((char)('A' + (str.charAt(i) - 'a')));
        }
      }
      bw.write(sb + "\n");
      bw.flush();
      br.close();
      bw.close();
    }
}
