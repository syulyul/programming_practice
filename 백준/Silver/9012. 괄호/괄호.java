import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      bw.write(checkParentheses(str));
    }

    bw.newLine();
    bw.flush();
    bw.close();
  }

  private static String checkParentheses(String str) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == '(') {
        stack.push(ch);
      } else if (ch == ')') {
        if (stack.isEmpty()) {
          return "NO\n";
        } else {
          stack.pop();
        }
      }
    }

    if (stack.isEmpty()) {
      return "YES\n";
    } else {
      return "NO\n";
    }
  }
}