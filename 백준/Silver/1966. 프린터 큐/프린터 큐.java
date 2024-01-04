import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      LinkedList<int[]> q = new LinkedList<>();

      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < N; j++) {
        q.offer(new int[]{ j, Integer.parseInt(st.nextToken()) });
      }

      int order = 0;

      while (!q.isEmpty()) {
        int[] current = q.poll();
        boolean isMax = true;

        for(int j = 0; j < q.size(); j++) {

          if(current[1] < q.get(j)[1]) {
            q.offer(current);
            for(int k = 0; k < j; k++) {
              q.offer(q.poll());
            }
            
            isMax = false;
            break;
          }
        }

        if(isMax == false) {
          continue;
        }

        order++;
        if(current[0] == M) {
          break;
        }
      }
      bw.write(String.valueOf(order));
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }
}
