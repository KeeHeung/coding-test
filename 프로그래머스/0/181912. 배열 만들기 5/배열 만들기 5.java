import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
		int idx = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < intStrs.length; i++) {
			String tmpStr = intStrs[i].substring(s, intStrs[i].length());
			String retStr = tmpStr.substring(0, l);
			if (Integer.parseInt(retStr) > k) {
				answer.add(Integer.parseInt(retStr));
			}
		}
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}