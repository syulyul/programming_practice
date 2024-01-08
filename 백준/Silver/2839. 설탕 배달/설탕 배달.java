import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int bag5 = N / 5;
        int bag3 = 0;
        int r = 0;

        while (bag5 >= 0) {
          if (bag5 > 0) {
            r = N - bag5 * 5;
          } else {
            r = N;
          }

          bag3 = r / 3;
          r %= 3;

          if (r == 0) {
            bw.write(String.valueOf(bag5 + bag3));
            break;
          }
          bag5--;
        }

        if (r != 0) {
          bw.write("-1");
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }
}
