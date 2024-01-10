import java.io.*;

public class Main {
  private static int[] sorted;

  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      // 수의 개수 N 입력
      int N = Integer.parseInt(br.readLine());

      // 수를 저장할 배열 선언
      int[] numbers = new int[N];
      sorted = new int[N];

      // N개의 수 입력
      for (int i = 0; i < N; i++) {
          numbers[i] = Integer.parseInt(br.readLine());
      }

      // 병합 정렬 호출
      mergeSort(numbers, 0, N - 1);

      // 정렬된 수 출력
      for (int i = 0; i < N; i++) {
          bw.write(String.valueOf(numbers[i]));
          bw.newLine();
      }

      bw.flush();
      bw.close();
      br.close();
  }

  // 병합 정렬 구현
  private static void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
          int mid = (left + right) / 2;
          mergeSort(arr, left, mid);
          mergeSort(arr, mid + 1, right);
          merge(arr, left, mid, right);
      }
  }

  private static void merge(int[] arr, int left, int mid, int right) {
      int i = left;
      int j = mid + 1;
      int k = left;

      while (i <= mid && j <= right) {
          if (arr[i] <= arr[j]) {
              sorted[k++] = arr[i++];
          } else {
              sorted[k++] = arr[j++];
          }
      }

      while (i <= mid) {
          sorted[k++] = arr[i++];
      }

      while (j <= right) {
          sorted[k++] = arr[j++];
      }

      for (int idx = left; idx <= right; idx++) {
          arr[idx] = sorted[idx];
      }
  }
}
