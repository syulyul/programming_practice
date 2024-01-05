import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] level = new int[n];
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
      level[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(level);

    int exclude = (int) Math.round(n * 0.3 / 2);

    for (int i = exclude; i < n - exclude; i++) {
      sum += level[i];
    }

    double avg = (double) sum / (n - exclude * 2);

    bw.write(String.valueOf(Math.round(avg)));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}