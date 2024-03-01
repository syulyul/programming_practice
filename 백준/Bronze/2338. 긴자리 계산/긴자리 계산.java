import java.io.*;
import java.math.BigInteger;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
  public static void main(String[] args) throws IOException {
    BigInteger A = new BigInteger(br.readLine());
    BigInteger B = new BigInteger(br.readLine());

    bw.write(A.add(B) + "\n");
    bw.write(A.subtract(B) + "\n");
    bw.write(A.multiply(B) + "\n");
    br.close();
    bw.close();
  }
}
