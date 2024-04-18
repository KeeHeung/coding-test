class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] == 1) continue;
			if (num_list[i] % 2 == 0) {
				int num = num_list[i];
				while(num != 1) {
					num = num / 2;
					answer++;
				}
			}
			if (num_list[i] % 2 != 0) {
				int num = num_list[i];
				while(num != 1) {
					num = num / 2;
					answer++;
				}
			}
		}
        return answer;
    }
}