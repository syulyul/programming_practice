import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    ArrayList<Integer> al = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      al.add(Integer.parseInt(br.readLine()));
    }
    // 이진 탐색을 위한 초기값 설정
    long start = 1;
    long end = Collections.max(al);

    // 이진 탐색 시작
    while (start <= end) {
      long mid = (start + end) / 2;
      long cnt = 0;

      // mid 길이로 잘랐을 때 얻을 수 있는 랜선의 개수 계산
      for (int i = 0; i < n; i++) {
          cnt += al.get(i) / mid;
      }

      // 얻은 랜선의 개수가 목표 개수보다 크거나 같으면 길이를 늘림
      if (cnt >= m) {
          start = mid + 1;
      } else {
          // 목표 개수보다 작으면 길이를 줄임
          end = mid - 1;
      }
    }

    // 최대 길이 출력
    bw.write(String.valueOf(end));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}
