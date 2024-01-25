import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] time = new int[N];
		for (int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		br.close();

		Arrays.sort(time);

		int sum = time[0];
		int prevSum = time[0];
		for (int i = 1; i < N; i++) {
			sum += prevSum + time[i];
			prevSum += time[i];
		}
		
		bw.write(sum + "\n");
		bw.close();
	}
}