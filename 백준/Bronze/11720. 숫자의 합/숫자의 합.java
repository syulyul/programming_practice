import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] num = new int[N];
    int sum = 0;
    String str = String.valueOf(br.readLine());

    for (int i = 0; i < str.length(); i++) {
      num[i] = str.charAt(i) - '0';
    }

    for (int i = 0; i < N; i++) {
      sum += num[i];
    }

    bw.write(String.valueOf(sum));
    bw.newLine();
    bw.close();
  }
}