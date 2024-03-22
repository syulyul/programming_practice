import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        nums.add(i);
      }
    }
    if (nums.size() < K) {
      bw.write("0\n");
    } else {
      bw.write(nums.get(K - 1) + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
