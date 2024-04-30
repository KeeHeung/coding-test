import static java.lang.Character.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) >= 97) answer += toUpperCase(my_string.charAt(i));
			else answer += toLowerCase(my_string.charAt(i));
		}        
        return answer;
    }
}