class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = (num_list.length + n - 1) / n;
        int[] answer = new int[count];
        
        int answerIndex = 0; 
        for (int i = 0; i < num_list.length; i += n) {
            answer[answerIndex++] = num_list[i]; 
        }

        return answer;
    }
}