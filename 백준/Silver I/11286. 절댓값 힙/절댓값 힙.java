import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> 
      Math.abs(a) == Math.abs(b) ? a - b : Math.abs(a) - Math.abs(b)
    );

    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      if (x == 0) {
        if (pq.isEmpty()) {
          bw.write("0\n");
        } else {
          bw.write(pq.poll() + "\n");
        }
      } else {
        pq.offer(x);
      }
    }
    
    bw.flush();
    br.close();
    bw.close();
  }
}