import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
       
		Double cnt = (double) Math.ceil((double) my_str.length() / n) ;
		String[] answer = new String[cnt.intValue()];
		
        int j = 0;
		for (int i = 0; i < cnt.intValue(); i++) {
			if (my_str.length() % n == 0) {
				answer[i] = my_str.substring(j, j+n);
			} else {
				if (i == cnt - 1) {
					answer[i] = my_str.substring(j);
				} else {
					answer[i] = my_str.substring(j, j+n);
				}
			}

			j = j + n ;
		}
        
        return answer;
    }
}