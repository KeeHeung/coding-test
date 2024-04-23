import java.util.*;

class Solution {
    public int solution(int[] arr) { //리팩토링한 코드

		int answer = 0;
		while (true) {
			int[] temp = Arrays.copyOf(arr, arr.length);
			for (int i = 0; i < arr.length; i++) {
				if (temp[i] >= 50 && temp[i] % 2 == 0) temp[i] = temp[i] / 2;
				else if (temp[i] < 50 && temp[i] % 2 != 0) temp[i] = temp[i] * 2 + 1;
			}
			if (Arrays.equals(arr, temp)) {
				break;
			} else {
				arr = temp;
				answer++;
			}
		}
        
        return answer;
    }
}