class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			int idxVal = num_list[i];
			if (idxVal < 0) {
				answer = i;
				break;
			} else if (idxVal > 0) {
				answer = -1;
				continue;
			}
		}
        return answer;
    }
}