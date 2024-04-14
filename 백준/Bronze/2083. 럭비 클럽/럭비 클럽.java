import java.io.*;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      int age = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());
      if (name.equals("#") && age == 0 && weight == 0)
        break;
      bw.write(name + " ");
      if (age > 17 || weight >= 80) {
        bw.write("Senior\n");
      } else {
        bw.write("Junior\n");
      }
    }
    br.close();
    bw.flush();
    bw.close();
  }
}