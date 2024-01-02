import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] num = br.readLine().split("\\s+");

    int a = Integer.parseInt(num[0]);
    int b = Integer.parseInt(num[1]);

    int gcd = getGCD(a, b);

    bw.write(String.valueOf(gcd));
    bw.newLine();
    bw.write(String.valueOf(a * b / gcd));
    bw.newLine();
    bw.flush();
    bw.close();
  }

  private static int getGCD (int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
}
