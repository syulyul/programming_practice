import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int S = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int H = Integer.parseInt(br.readLine());
    
    int coke = Integer.parseInt(br.readLine());
    int cider = Integer.parseInt(br.readLine());

    bw.write(Math.min(Math.min(S, M), H) + Math.min(coke, cider) - 50 + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}