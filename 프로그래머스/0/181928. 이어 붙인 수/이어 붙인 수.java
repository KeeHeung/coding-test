class Solution {
    public int solution(int[] num_list) {
        String oddNum = "";
        String evenNum = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNum += Integer.toString(num_list[i]);
            }
            if (num_list[i] % 2 != 0) {
                oddNum += Integer.toString(num_list[i]);
            }
        }
        return Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
    }
}