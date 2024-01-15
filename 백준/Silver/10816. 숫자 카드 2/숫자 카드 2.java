import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 상근이가 가지고 있는 숫자 카드의 개수 N
    int N = Integer.parseInt(br.readLine());

    // 숫자 카드에 적혀있는 정수를 저장하는 HashMap
    HashMap<Integer, Integer> cardMap = new HashMap<>();

    // 숫자 카드에 적혀있는 수 입력
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
        int num = Integer.parseInt(st.nextToken());
        // HashMap에 해당 숫자가 이미 있다면 기존 값을 가져와 1 증가시키고, 없다면 1로 설정
        cardMap.put(num, cardMap.getOrDefault(num, 0) + 1);
    }

    // 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수 개수 M
    int M = Integer.parseInt(br.readLine());

    // 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수를 배열에 저장
    int[] numbersToFind = new int[M];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
        numbersToFind[i] = Integer.parseInt(st.nextToken());
    }

    // 결과 출력
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
        // HashMap에서 해당 숫자의 개수를 가져오고, 없다면 0을 출력
        sb.append(cardMap.getOrDefault(numbersToFind[i], 0)).append(" ");
    }

    bw.write(sb.toString());
    bw.newLine();
    bw.close();
  }
}