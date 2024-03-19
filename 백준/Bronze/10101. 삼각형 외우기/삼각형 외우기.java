import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int sum = A + B + C;

    if (A == 60 && B == 60 && C == 60) {
      bw.write("Equilateral\n");
    } else if (sum == 180 && (A == B || A == C || C == B)) {
      bw.write("Isosceles\n");
    } else if (sum == 180 && (A != B && B != C)) {
      bw.write("Scalene\n");
    } else if (sum != 180) {
      bw.write("Error");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
