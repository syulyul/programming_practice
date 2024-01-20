import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> S = new ArrayList<>();
    
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String input = st.nextToken();
      int num = 0;

      switch (input) {
        case "add":
          num = Integer.parseInt(st.nextToken());
          if (!S.contains(num)) {
            S.add(num);
          }
          break;

        case "remove":
          num = Integer.parseInt(st.nextToken());
          S.remove((Integer)num);
          break;

        case "check":
          num = Integer.parseInt(st.nextToken());
          if (S.contains(num)) {
            bw.write("1\n");
          } else {
            bw.write("0\n");
          }
          break;

        case "toggle":
          num = Integer.parseInt(st.nextToken());
          if (S.contains(num)) {
            S.remove((Integer)num);
          } else {
            S.add(num);
          }
          break;

        case "all":
          S.clear();
          for (int x = 0; x <= 20; x++) {
            S.add(x);
          }
          break;

        case "empty":
          S.clear();
          break;

        default:
          break;
      }
    }
      
    bw.close();
  }
}
