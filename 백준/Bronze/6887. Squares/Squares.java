import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int square = Integer.parseInt(br.readLine());
    bw.write("The largest square has side length " + (int)Math.sqrt(square) + ".\n");
    br.close();
    bw.flush();
    bw.close();
  }
}