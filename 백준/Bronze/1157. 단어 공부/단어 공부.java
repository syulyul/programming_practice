import java.io.*;

public class Main {
  static int cnt[] = new int[26];
  static int max = 0;
  static int count = 0;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] c = br.readLine().toUpperCase().toCharArray();

    for (int i = 0; i < c.length; i++) {
      cnt[c[i] - 'A']++;
    }

    for (int i = 0; i < cnt.length; i++) {
      if (cnt[i] > max) {
        max = cnt[i];
      }
    }

    for (int i = 0; i < cnt.length; i++) {
      if (cnt[i] == max) {
        count++;
      }
    }

    for (int i = 0; i < cnt.length; i++) {
      if (count > 1) {
        System.out.println("?");
        break;
      } else if (cnt[i] == max) {
        System.out.println((char)(i + 'A'));
        break;
      }
    }
    
  }
}
