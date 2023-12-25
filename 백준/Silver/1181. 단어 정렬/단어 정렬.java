import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String[] str = new String[n];
    
    for (int i = 0; i < n; i++) {
      str[i] = br.readLine();
    }

    LinkedHashSet<String> hs = new LinkedHashSet<>();

    Arrays.sort(str);
    Arrays.sort(str, Comparator.comparingInt(String::length));

    for (int i = 0; i < str.length; i++) {
      String s = "";
      for (char ch : str[i].toCharArray()) {
        if (ch >= 'a' && ch <= 'z') {
          s += ch;
        }
      }
      if (s.equals(str[i])) {
        hs.add(str[i]);
      }
    }
    
    for (String el : hs) {
      bw.write(el);
      bw.newLine();
    }

    bw.flush();
  }
}
