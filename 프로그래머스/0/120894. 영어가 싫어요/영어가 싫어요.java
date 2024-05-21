class Solution {
    public long solution(String numbers) {

		String[] strNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for(int i = 0; i < strNums.length; i++){
            numbers = numbers.replaceAll(strNums[i], nums[i]);
        }

        return Long.parseLong(numbers); 
    }
}