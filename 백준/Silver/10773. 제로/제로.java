import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    int sum = 0;
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num == 0) {
        stack.pop();
      } else {
        stack.push(num);
      }
    }
    br.close();

    for (int i = 0; i < stack.size(); i++) {
      sum += stack.get(i);
    }

    bw.write(String.valueOf(sum));
    bw.newLine();
    bw.close();
  }
}
