import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        // ArrayList<Integer>[] al = new ArrayList<>();
        
        if (arr.length > arr[0].length) {
            int newArr[][] = new int[arr.length][arr[0].length + (arr.length - arr[0].length)];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    newArr[i][j] = arr[i][j];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr[0].length; j < arr.length - arr[0].length + 1; j++) {
                    newArr[i][j] = 0;   
                }
            }
            answer = new int[newArr.length][newArr[0].length];
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[0].length; j++) {
                    answer[i][j] = newArr[i][j];
                }
            }
        } else if (arr[0].length > arr.length) {
            int newArr[][] = new int[arr[0].length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    newArr[i][j] = arr[i][j];
                }
            }
            for (int i = arr.length; i < arr[0].length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    newArr[i][j] = 0;
                }
            }
            answer = new int[newArr.length][newArr[0].length];
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[0].length; j++) {
                    answer[i][j] = newArr[i][j];
                }
            }
        } else {
            answer = new int[arr.length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}