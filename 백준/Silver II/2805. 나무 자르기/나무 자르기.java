import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] trees = new int[N];
    int max = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      trees[i] = Integer.parseInt(st.nextToken());
      max = Math.max(max, trees[i]);
    }

    // 이분 탐색을 이용하여 가능한 높이의 범위를 좁혀나가면서 상근이가 가져갈 나무의 최대 높이 탐색
    int left = 0, right = max;
    int ret = 0;

    while (left <= right) {
      int mid = (left + right) / 2;
      long sum = 0;

      for (int tree : trees) {
        // mid보다 큰 나무는 절단하여 mid 높이로 맞추고, 작은 나무는 그대로 유지
        if (tree > mid) {
          sum += tree - mid;
        }
      }

      // 상근이가 가져갈 나무의 길이가 M보다 크거나 같은지를 확인하고, 이분 탐색 진행
      if (sum >= M) {
        ret = mid; // 현재 높이를 저장하고
        left = mid + 1; // 더 높은 높이를 탐색
      } else {
        right = mid - 1; // 현재 높이를 내리고
      }
    }
    
    bw.write(ret + "\n");
    bw.flush(); // 버퍼 비우기
    br.close();
    bw.close();
  }
}