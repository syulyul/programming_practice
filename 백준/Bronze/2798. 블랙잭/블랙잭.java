import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    String[] str = br.readLine().split("\\s+");
    int[] num = new int[N];
    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(str[i]);
    }

    HashMap<Integer, Integer> hm = new HashMap<>();
    
    for (int i = 0; i < N; i++) {
      hm.put(i, M - num[i]);
    }
    
    List<Map.Entry<Integer, Integer>> el = new LinkedList<>(hm.entrySet());
    el.sort(Map.Entry.comparingByValue());
    
    
    int maxSum = 0;
    for (int i = 0; i < el.size() - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = 0;
          Map.Entry<Integer, Integer> entry = el.get(i);
          sum += num[entry.getKey()];
          entry = el.get(j);
          sum += num[entry.getKey()];
          entry = el.get(k);
          sum += num[entry.getKey()];

          if (sum <= M && sum >= maxSum) {
            maxSum = sum;
          }
        }
      }
    }
    
    bw.write(String.valueOf(maxSum));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}