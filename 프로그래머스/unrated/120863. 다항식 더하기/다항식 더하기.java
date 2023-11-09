class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll(" ", "");
        String[] SplitPlus = polynomial.split("\\+");
        int[] cnt = new int[SplitPlus.length];
        int xSum = 0;
        int num = 0;
        
        for (int i = 0; i < SplitPlus.length; i++) {
            if (SplitPlus[i].contains("x")) {
                if (SplitPlus[i].length() == 1) {
                    cnt[i]++;
                } else {
                    cnt[i] = Integer.parseInt(SplitPlus[i].split("x")[0]);
                }
            }
        }
        
        for (int i = 0; i < cnt.length; i++) {
            xSum += cnt[i];
        }
        
        if (xSum == 0) {
            answer = "";
        } else if (xSum == 1) {
            answer = "x";
        } else {
            answer = xSum + "x";   
        }
        
        for (int i = 0; i < SplitPlus.length; i++) {
            if (!SplitPlus[i].contains("x")) {
                num += Integer.parseInt(SplitPlus[i]);
            }
        }
        
        if (xSum != 0 && num != 0) {
            answer += " + " + num;   
        } else if (num != 0) {
            answer += num;
        }
        
        return answer;
    }
}