import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    String str = "";
    while (!(str = br.readLine()).equals(".")) {
      bw.write(isBalanced(str));
    }
    br.close();
    bw.close();
  }

  private static String isBalanced (String str) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '(' || ch == '[') {
        stack.push(ch);
      } else if (ch == ')' || ch == ']') {
        if (stack.isEmpty()) {
          return "no\n"; // 여는 괄호 없이 닫는 괄호가 나올 경우
        }
        char top = stack.pop();
        if (!((top == '(' && ch == ')') || (top == '[' && ch == ']'))) {
          return "no\n"; // 괄호 쌍이 매칭되지 않는 경우
        }
      }
    }

    if (stack.isEmpty()) {
      return "yes\n"; // 괄호가 쌍을 이룸
    } else {
      return "no\n"; // 여는 괄호가 남아있음
    }
  }
}
