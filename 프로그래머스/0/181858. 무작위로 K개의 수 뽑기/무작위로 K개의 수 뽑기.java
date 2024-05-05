import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) list.add(arr[i]);
		}

		int[] answer = new int[k];
		for (int i = 0; i < answer.length; i++) {
			if (i >= list.size()) answer[i] = -1;
			else answer[i] = list.get(i);
		}
        
        return answer;
    }
}