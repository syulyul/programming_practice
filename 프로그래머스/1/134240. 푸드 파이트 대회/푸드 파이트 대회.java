class Solution {
    public String solution(int[] food) {
        String str = "";
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                str += String.valueOf(i);
            }
        }
        
        StringBuffer sb = new StringBuffer(str);
        String revStr = sb.reverse().toString();
        str += "0" + revStr;
        
        return str;
    }
}