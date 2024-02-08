import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num > 0) {
        pq.offer(num);
      } else if (num == 0) {
        if (pq.isEmpty()) {
          bw.write("0\n");
        } else {
          bw.write(pq.poll() + "\n");
        }
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
