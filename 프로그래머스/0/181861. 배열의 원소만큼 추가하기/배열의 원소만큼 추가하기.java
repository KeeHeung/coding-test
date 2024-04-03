class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) len += arr[i]-1;
            else len += 0;
        }
        int[] answer = new int[len];
        
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer[idx] = arr[i];
				idx++;
			}
		}
        return answer;
    }
}