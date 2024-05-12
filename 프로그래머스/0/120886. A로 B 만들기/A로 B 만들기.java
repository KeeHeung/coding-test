import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        String[] beforeList = before.split("");
		String[] afterList = after.split("");

		Arrays.sort(beforeList);
		Arrays.sort(afterList);

		for (int i = 0; i < beforeList.length; i++) {
			if (!beforeList[i].equals(afterList[i])) {
				answer = 0;
				break;
			}
		}
        
        return answer;
    }
}