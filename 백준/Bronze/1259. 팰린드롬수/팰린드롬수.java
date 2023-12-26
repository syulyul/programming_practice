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

    for (String origin : al) {
      String s = origin.substring(0, origin.length() / 2);
      String rs = (origin.length() % 2 == 0) ? 
                new StringBuilder(origin.substring(origin.length() / 2)).reverse().toString() :
                new StringBuilder(origin.substring(origin.length() / 2 + 1)).reverse().toString();
      
      bw.write(s.equals(rs) ? "yes\n" : "no\n");
    }
    
    bw.flush();
    bw.close();
  }
}
