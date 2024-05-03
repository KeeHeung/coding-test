import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
		ArrayList<Integer> stk = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (stk.size() == 0) {
				stk.add(new Integer(arr[i]));
			}
			else if (stk.get(stk.size() - 1) == arr[i]) {
				stk.remove(stk.size() - 1);
			}
			else {
				stk.add(new Integer(arr[i]));
			}
		}
		if (stk.size() == 0) stk.add(-1);
        
		int[] answer = stk.stream()
				.mapToInt(k -> k)
				.toArray();
        
        return answer;
    }
}