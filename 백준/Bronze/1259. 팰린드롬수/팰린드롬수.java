import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = "";
    ArrayList<String> al = new ArrayList<>();

    while(!(str = br.readLine()).equals("0")) {
      StringTokenizer st = new StringTokenizer(str);
      al.add(st.nextToken());
    }

    for (int i = 0; i < al.size(); i++) {
      String origin = al.get(i);
      String s = "";
      String rs = "";

      for (int j = 0; j < origin.length() / 2; j++) {
        s += origin.charAt(j) + "";
      }

      if (origin.length() % 2 == 0) {
        for (int j = origin.length() - 1; j >= s.length(); j--) {
          rs += origin.charAt(j) + "";
        }
      } else {
        for (int j = origin.length() - 1; j > s.length(); j--) {
          rs += origin.charAt(j) + "";
        }
      }

      if (s.equals(rs)) {
        bw.write("yes");
      } else {
        bw.write("no");
      }
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }
}
