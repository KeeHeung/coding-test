import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.toLowerCase().split("");
		Arrays.sort(str);
        String answer = "";
		for (int i = 0; i < str.length; i++) {
			answer += str[i];
		}
        return answer;
    }
}