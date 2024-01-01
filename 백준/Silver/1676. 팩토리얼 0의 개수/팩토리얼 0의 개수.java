import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int cnt = countZerosInFactorial(n);

    bw.write(String.valueOf(cnt));
    bw.newLine();
    bw.flush();
    bw.close();
}

private static int countZerosInFactorial(int n) {
    int cnt = 0;

    for (int i = 5; i <= n; i *= 5) {
        cnt += n / i;
    }

    return cnt;
  }
}