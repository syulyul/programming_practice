import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    
    Deque<Integer> d = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String input = st.nextToken();
      int num = 0;
      
      switch (input) {
        case "push_front":
          num = Integer.parseInt(st.nextToken());
          d.offerFirst(num);
          break;

        case "push_back":
          num = Integer.parseInt(st.nextToken());
          d.offerLast(num);
          break;

        case "pop_front":
          if (!d.isEmpty()) {
            bw.write(String.valueOf(d.pollFirst()));
          } else {
            bw.write("-1");
          }
          break;

        case "pop_back":
          if (!d.isEmpty()) {
            bw.write(String.valueOf(d.pollLast()));
          } else {
            bw.write("-1");
          }
          break;

        case "size":
          bw.write(String.valueOf(d.size()));
          break;

        case "empty":
          if (d.isEmpty()) {
            bw.write("1");
          } else {
            bw.write("0");
          }
          break;
          
        case "front":
          if (!d.isEmpty()) {
            bw.write(String.valueOf(d.peekFirst()));
          } else {
            bw.write("-1");
          }
          break;

        case "back":
          if (!d.isEmpty()) {
            bw.write(String.valueOf(d.peekLast()));
          } else {
            bw.write("-1");
          }
          break;
      
        default:
          break;
      }

      if (!input.startsWith("push")) {
        bw.newLine();
      }

    }
    bw.newLine();
    bw.close();
  }
}
