import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
		int[] firstArr = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
		int[] secondArr = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

		int[] combined = new int[firstArr.length + secondArr.length];
		System.arraycopy(firstArr, 0, combined, 0, firstArr.length);
		System.arraycopy(secondArr, 0, combined, firstArr.length, secondArr.length);
        
        return combined;
    }
}