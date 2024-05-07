import java.util.*;

class Solution {
    public int[] solution(String my_string) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) < 65) {
				String tmp = String.valueOf(my_string.charAt(i));
				list.add(Integer.parseInt(tmp));
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
        
        return answer;
    }
}