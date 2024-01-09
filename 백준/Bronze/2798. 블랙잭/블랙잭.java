import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 입력 받기
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] cards = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(st.nextToken());
    }

    int maxSum = 0;

    // 가능한 모든 카드 조합의 합 계산
    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = cards[i] + cards[j] + cards[k];

          // 주어진 M을 넘지 않으면서 최대한 가까운 합 갱신
          if (sum <= M && sum > maxSum) {
              maxSum = sum;
          }
        }
      }
    }

    // 결과 출력
    bw.write(String.valueOf(maxSum));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}
