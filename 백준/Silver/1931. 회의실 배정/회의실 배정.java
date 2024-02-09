import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[][] meeting = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int endTime = 0; // 회의가 끝나는 시간을 저장하는 변수
		int cnt = 0; // 최대로 회의를 배정할 수 있는 개수를 저장하는 변수
		
		// 회의 배정하기
		for (int i = 0; i < N; i++) {
			if (meeting[i][0] >= endTime) { // 현재 회의의 시작 시간이 이전에 배정된 회의의 끝나는 시간보다 늦거나 같은 경우
				endTime = meeting[i][1]; // 현재 회의를 배정하고 끝나는 시간 업데이트
				cnt++; // 회의 개수 증가
			}
		}

		bw.write(cnt + "\n");
		br.close();
		bw.close();
	}
}