import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    HashSet<Integer> arr1 = new HashSet<>();
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr1.add(Integer.parseInt(st1.nextToken()));
    }
    int M = Integer.parseInt(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      if (arr1.contains(Integer.parseInt(st2.nextToken()))) {
        bw.write(String.valueOf(1));
        bw.newLine();
      } else {
        bw.write(String.valueOf(0));
        bw.newLine();
      }
    }

    bw.flush();
    bw.close();
  }
}
