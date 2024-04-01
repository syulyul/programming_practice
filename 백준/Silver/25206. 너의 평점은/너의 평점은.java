import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    Map<String, Double> grades = new HashMap<>();
    grades.put("A+", 4.5);
    grades.put("A0", 4.0);
    grades.put("B+", 3.5);
    grades.put("B0", 3.0);
    grades.put("C+", 2.5);
    grades.put("C0", 2.0);
    grades.put("D+", 1.5);
    grades.put("D0", 1.0);
    grades.put("F", 0.0);

    int total = 0;
    double totalScore = 0.0;

    for (int i = 0; i < 20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String subject = st.nextToken();
      double score = Double.parseDouble(st.nextToken());
      String grade = st.nextToken();

      if (!grade.equals("P")) {
        total += score;
        totalScore += grades.get(grade) * score;
      }
    }

    if (total == 0) {
      bw.write("0.000000");
    } else {
      double ret = totalScore / total;
      bw.write(String.format("%.6f\n", ret));
    }
    br.close();
    bw.flush();
    bw.close();
  }
}