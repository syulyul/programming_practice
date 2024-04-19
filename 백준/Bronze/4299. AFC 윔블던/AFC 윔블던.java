import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int sum = Integer.parseInt(input[0]);
        int diff = Integer.parseInt(input[1]);

        // 득점 합과 득점 차를 이용하여 경기 결과 계산
        int score1 = (sum + diff) / 2;
        int score2 = sum - score1;

        // 두 팀의 득점이 음수인 경우 결과가 없음을 출력
        if (score1 < 0 || score2 < 0 || (sum + diff) % 2 != 0) {
            bw.write("-1\n");
        } else {
            // 득점이 정수인 경우 결과 출력
            bw.write(Math.max(score1, score2) + " " + Math.min(score1, score2) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}