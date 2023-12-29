import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    
    ArrayList<String> al = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      al.add(checkParentheses(str));
      bw.write(al.get(i));
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
          return "NO\n"; // 여는 괄호 없이 닫는 괄호가 나올 경우
        } else {
          stack.pop();
        }
      }
    }

    if (stack.isEmpty()) {
      return "YES\n"; // 괄호가 쌍을 이룸
    } else {
      return "NO\n"; // 여는 괄호가 남아있음
    }
  }
}