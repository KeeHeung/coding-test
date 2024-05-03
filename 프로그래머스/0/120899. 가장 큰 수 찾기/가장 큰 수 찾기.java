import java.util.*;

class Solution {
    public int[] solution(int[] array) {
		int maxNum = 0;
		for (int i = 0; i < array.length; i++) {
			if (maxNum < array[i]) maxNum = array[i];
		}

		int[] answer = new int[2];
		answer[0] = maxNum;
		answer[1] = Arrays.binarySearch(array, maxNum);
        
        return answer;
    }
}