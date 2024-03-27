class Solution {
    public int[] solution(int[] arr, int n) {
        boolean oddNum = arr.length % 2 != 0;
        boolean evenNum = arr.length % 2 == 0;
        
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (oddNum && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else if (oddNum && i % 2 != 0) {
                answer[i] = arr[i];
            } else if (evenNum && i % 2 != 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}