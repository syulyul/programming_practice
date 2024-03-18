import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {

    int L = Integer.parseInt(br.readLine());
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int D = Integer.parseInt(br.readLine());

    if (A % C == 0) {
      if (B % D == 0) {
        L -= Math.max(A / C, B / D);
      } else {
        L -= Math.max(A / C, B / D + 1);
      }
    } else {
      if (B % D == 0) {
        L -= Math.max(A / C + 1, B / D);
      } else {
        L -= Math.max(A / C + 1, B / D + 1);
      }
    }

    bw.write(L + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
