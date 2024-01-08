import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          String input = st.nextToken();

          switch (input) {
            case "push":
              int num = Integer.parseInt(st.nextToken());
              q.offer(num);
              break;

            case "pop":
              if (!q.isEmpty()) {
                  bw.write(String.valueOf(q.poll()));
              } else {
                  bw.write("-1");
              }
              break;

            case "size":
              bw.write(String.valueOf(q.size()));
              break;

            case "empty":
              if (q.isEmpty()) {
                  bw.write("1");
              } else {
                  bw.write("0");
              }
              break;

            case "front":
              if (!q.isEmpty()) {
                  bw.write(String.valueOf(q.peek()));
              } else {
                  bw.write("-1");
              }
              break;

            case "back":
              if (!q.isEmpty()) {
                  bw.write(String.valueOf(((LinkedList<Integer>) q).getLast()));
              } else {
                  bw.write("-1");
              }
              break;
                  
            default:
              break;
                  
          }
          if (!input.equals("push")) {
            bw.newLine();
          }
        }

        bw.flush();
        bw.close();
    }
}
