import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int number = 1;

    while (true) {
      int sum = 0;
      int num = number;
      sum += num;
      for (int i = 0; i < String.valueOf(n).length(); i++) {
        sum += num % 10;
        num /= 10;
      }
      if (sum == n) {
        bw.write(String.valueOf(number));
        bw.newLine();
        break;
      }
      if (number > n) {
        bw.write("0\n");
        break;
      }
      number++;
    }
    
    bw.flush();
    bw.close();
  }
}
