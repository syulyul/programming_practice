import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    
    ArrayList<Integer> key = new ArrayList<>();
    HashMap<Integer, Integer> money = new HashMap<>();

    for (int i = 0; i < N; i++) {
      int A = Integer.parseInt(br.readLine());
      money.put(A, 0);
      key.add(A);
    }
    
    while (K != 0) {
      for (int i = N - 1; i >= 0; i--) {
        int target = key.get(i);
        int cnt = K / target;
        if (K / target > 0) {
          money.put(target, money.get(target) + cnt);
          K %= target;
        } else {
          continue;
        }
      }
    }

    int sum = 0;
    for (Map.Entry<Integer, Integer> entry : money.entrySet()) {
      sum += entry.getValue();
    }

    bw.write(sum + "\n");
    br.close();
    bw.close();
  }
}
