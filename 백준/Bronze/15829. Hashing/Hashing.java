import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
  static final BigInteger MOD = BigInteger.valueOf(1234567891);
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int L = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      String str = st.nextToken();
      int[] num = new int[L];
      BigInteger b = BigInteger.ZERO;

      for (int i = 0; i < L; i++) {
        num[i] = str.charAt(i) - 96;
      }
      b = b.add(BigInteger.valueOf(num[0]));

      for (int i = 1; i < L; i++) {
        BigInteger r = BigInteger.valueOf(31);
        for (int j = 0; j < i - 1; j++) {
          r = r.multiply(BigInteger.valueOf(31));
        }
        b = b.add(BigInteger.valueOf(num[i]).multiply(r));
      }

      bw.write(String.valueOf(b.mod(MOD)));
      bw.newLine();
      bw.flush();
      bw.close();
  }
}
