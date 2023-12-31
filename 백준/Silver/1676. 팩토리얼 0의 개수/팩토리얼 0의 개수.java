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

    // 2와 5의 갯수 중 더 작은 것이 0의 갯수를 결정한다.
    // 5의 갯수가 더 적으므로 5의 갯수를 세기
    for (int i = 5; i <= n; i *= 5) {
        cnt += n / i;
    }

    return cnt;
  }
}