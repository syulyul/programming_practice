class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String str = "";

        try {
            str = my_string.substring(my_string.length() - is_suffix.length());
            if (str.equals(is_suffix)) {
                answer = 1;
                return answer;
            }
            return answer;
        } catch (IndexOutOfBoundsException e) {
          return 0;
        }
    }
}