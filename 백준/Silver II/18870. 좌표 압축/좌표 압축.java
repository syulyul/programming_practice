import java.io.*;
import java.util.*;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws IOException {

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    // 입력된 좌표를 저장할 배열
    int[] num = new int[N];
    
    // 좌표를 TreeSet에 저장하여 중복을 제거하고 정렬
    TreeSet<Integer> ts = new TreeSet<>();
    
    // 좌표를 입력 받고 TreeSet에 추가
    for (int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
      ts.add(num[i]);
    }
    
    // 좌표 압축 결과를 저장할 Map
    Map<Integer, Integer> compress = new HashMap<>();
    
    // 좌표를 압축하여 결과를 Map에 저장
    int compressedCoordinate = 0;
    for (int coordinate : ts) {
      compress.put(coordinate, compressedCoordinate++);
    }
    
    // 좌표 압축 결과 출력
    for (int i = 0; i < N; i++) {
      bw.write(compress.get(num[i]) + " ");
    }
    bw.newLine();
    bw.flush();
    bw.close();
    br.close();
  }
}
