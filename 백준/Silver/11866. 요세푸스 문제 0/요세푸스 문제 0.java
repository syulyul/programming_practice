import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    // int cnt = 0;
    Queue<Integer> q = new LinkedList<>();
    StringBuilder ret = new StringBuilder();

    // 큐에 1부터 N까지의 숫자를 순서대로 삽입
    for (int i = 1; i <= N; i++) {
      q.offer(i);
    }

    ret.append("<");

    while (!q.isEmpty()) {
      for (int i = 0; i < M - 1; i++) {
        // K - 1번째까지의 사람들을 큐의 뒤로 이동시킴
        q.offer(q.poll());
      }

      // K번째 사람을 출력 및 제거
      ret.append(q.poll());

      // 큐가 비어있지 않으면 쉼표 추가
      if (!q.isEmpty()) {
        ret.append(", ");
      }
    }

    ret.append(">");
    bw.write(ret.toString());
    bw.newLine();
    bw.close();
  }
}
