import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] seq = new int[n];

    ArrayList<String> al = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      seq[i] = Integer.parseInt(br.readLine());
    }

    Stack<Integer> stack = new Stack<>();
    int num = 1;

    for (int i = 0; i < n; i++) {
      while (stack.isEmpty() || stack.peek() != seq[i]) {
        stack.push(num);
        al.add("+\n");
        num++;

        if (num > n + 1) {
          bw.write("NO\n");
          bw.flush();
          bw.close();
          return;
        }
      }

      if (stack.peek() == seq[i]) {
        stack.pop();
        al.add("-\n");
      }
    }

    for (int i = 0; i < al.size(); i++) {
      bw.write(al.get(i));
    }
    bw.flush();
    bw.close();
  }
}