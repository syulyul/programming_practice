import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          String input = st.nextToken();
          
          switch (input) {
            case "push":
              stack.push(Integer.parseInt(st.nextToken()));
              break;

            case "pop":
            if (!stack.isEmpty()) {
              bw.write(String.valueOf(stack.pop()));
            } else {
              bw.write("-1");
            }
            break;

            case "size":
              bw.write(String.valueOf(stack.size()));
              break;

            case "empty":
            if (stack.isEmpty()) {
              bw.write("1");
            } else {
              bw.write("0");
            }
            break;

            case "top":
            if (!stack.isEmpty()) {
              bw.write(String.valueOf(stack.peek()));
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
