import java.io.*;
import java.util.*;

public class Main {
  private static boolean isPrime (int num) {
    if (num <= 1) return false;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(st.nextToken());
    }

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (isPrime(numbers[i])) {
        cnt++;
      }
    }

    bw.write(String.valueOf(cnt));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}
