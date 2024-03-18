class Solution {
    public int solution(int[] array, int n) {
        
        int answer = 0;
        int checkedNum = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer += checkedNum;
            }
        }
        return answer;
    }
}