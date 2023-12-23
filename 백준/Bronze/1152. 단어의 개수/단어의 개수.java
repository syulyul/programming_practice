import java.io.*;

public class Main {
  static int cnt = 0;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");

    for (int i = 0; i < str.length; i++) {
      if (!str[i].isEmpty()) {
        cnt++;
      }
    }

    System.out.println(cnt);
    
  }
}
