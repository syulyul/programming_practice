import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = "";
    ArrayList<String> al = new ArrayList<>();
    LinkedHashSet<String> hs = new LinkedHashSet<>();

    while((str = br.readLine()) != null && !str.isEmpty()) {
      StringTokenizer st = new StringTokenizer(str);
      al.add(st.nextToken());
    }

    Collections.sort(al);
    Collections.sort(al, Comparator.comparingInt(String::length));
    
    for (int i = 0; i < al.size(); i++) {
      String s = "";
      for (char ch : al.get(i).toCharArray()) {
        if (ch >= 'a' && ch <= 'z') {
          s += ch;
        }
      }
      if (s.equals(al.get(i))) {
        hs.add(al.get(i));
      }
    }
    
    for (String el : hs) {
        System.out.println(el);
    }
  }
}
