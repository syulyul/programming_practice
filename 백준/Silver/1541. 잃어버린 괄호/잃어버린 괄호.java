import java.io.*;
import java.util.*;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {        
      int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정 
		  String[] subNum = br.readLine().split("-");
		
 
      for (int i = 0; i < subNum.length; i++) {
        int temp = 0;

        // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
        String[] addNum = subNum[i].split("\\+");

        // 덧셈으로 나뉜 토큰들을 모두 더한다. 
        for (int j = 0; j < addNum.length; j++) {
          temp += Integer.parseInt(addNum[j]);
        }

        // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
        if (sum == Integer.MAX_VALUE) {
          sum = temp;
        } else {
          sum -= temp;
        }
      }
      bw.write(sum + "\n");
      bw.flush();
      br.close();
      bw.close();
    }
}
