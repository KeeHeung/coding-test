import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int temp = 0;

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp = temp * 10 + Character.getNumericValue(ch);
            } else {
                answer += temp;
                temp = 0;
            }
        }
        answer += temp;

        return answer;
    }
}