import java.io.*;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		// Counting Sort
		int[] count = new int[8001];
		
		for (int i = 0; i < N; i++) {
			count[num[i] + 4000]++;
		}
		int value[] = count.clone();
		for(int i = 1; i < 8001; i++)
			count[i] = count[i] + count[i - 1];
		
		int sortNum[]= new int[N];
		for (int i = N - 1; i >= 0; i--) {
			int tmp = count[num[i] + 4000] - 1;
			sortNum[tmp] = num[i];
			count[num[i] + 4000] = tmp;
		}

		// 1. 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += num[i];
		}
		System.out.println(Math.round(sum / (double)N));
			
		
		// 2. 둘째 줄에는 중앙값을 출력한다.
		bw.write(sortNum[N / 2] + "\n");
		
		// 3. 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
		int max = 0;
		int cnt = 0;
		int mode = 0;
		for(int i = 0; i < 8001; i++) {
			if(max < value[i])
				max = value[i];
		}
		for(int i = 0; i < 8001; i++) {
			if(max == value[i]) {
				cnt++;
				mode = i - 4000;
			}
			if(cnt == 2)
				break;
		}
		bw.write(mode + "\n");

		// 4. 넷째 줄에는 범위를 출력한다.
		bw.write((sortNum[N - 1] - sortNum[0]) + "\n");
		bw.close();	
	}
}