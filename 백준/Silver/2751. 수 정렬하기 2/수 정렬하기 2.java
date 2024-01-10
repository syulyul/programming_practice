import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num[] = new int[N];
      
        for (int i = 0; i < N; i++) {
          num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
          bw.write(String.valueOf(num[i]));
          bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
