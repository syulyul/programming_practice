import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
      String str = br.readLine();
      bw.write(str.length() + "\n");
      bw.flush();
      br.close();
      bw.close();
    }
}
