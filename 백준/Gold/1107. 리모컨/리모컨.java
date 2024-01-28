import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    Set<Character> broken = new HashSet<>();
    if (M > 0) {
      String[] brokenButtons = br.readLine().split(" ");
      for (String button : brokenButtons) {
        broken.add(button.charAt(0));
      }
    }

    int ret = Math.abs(N - 100);

    for (int i = 0; i <= 1000000; i++) {
      if (isPossible(i, broken)) {
        ret = Math.min(ret, Integer.toString(i).length() + Math.abs(i - N));
      }
    }
    bw.write(ret + "\n");

    br.close();
    bw.close();
  }
  
 public static boolean isPossible(int c, Set<Character> broken) {
    for (char digit : Integer.toString(c).toCharArray()) {
      if (broken.contains(digit)) {
          return false;
      }
    }
    return true;
  }
}
