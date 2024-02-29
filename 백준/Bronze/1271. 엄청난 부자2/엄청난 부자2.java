import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger n = new BigInteger(st.nextToken());
    BigInteger m = new BigInteger(st.nextToken());

    bw.write(n.divide(m) + "\n");
    bw.write(n.remainder(m) + "\n");
    br.close();
    bw.close();
  }
}
