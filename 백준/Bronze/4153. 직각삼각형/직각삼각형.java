import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0 && c == 0) {
        break;
      }
      
      ArrayList<Integer> al = new ArrayList<>();
      al.add(a);
      al.add(b);
      al.add(c);

      Collections.sort(al);

      int side1 = al.get(0);
      int side2 = al.get(1);
      int max = al.get(2);

      String ret = (max * max == side1 * side1 + side2 * side2) ?
          "right\n" : "wrong\n";
      bw.write(ret);
    }
    bw.flush();
    bw.close();
  }
}
