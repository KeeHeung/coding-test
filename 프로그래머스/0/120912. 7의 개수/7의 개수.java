class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        
		String[] nums = new String[array.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.toString(array[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length(); j++) {
				if ((nums[i].charAt(j)+"").equals("7") ) answer++;
			}
		}
        
        return answer;
    }
}