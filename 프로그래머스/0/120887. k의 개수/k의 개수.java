import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
		int answer = 0;
        
        ArrayList<Integer> numsBetweenItoJ = new ArrayList<>();
		for (int num = i; num <= j; num++) {
			numsBetweenItoJ.add(num);
		}

		for (int num : numsBetweenItoJ) {
			String strNum = num + "";
			for (char c : strNum.toCharArray()) {
				String str = c + "";
				if (str.equals(k + "")) answer++;
			}
		}
        return answer;
    }
}