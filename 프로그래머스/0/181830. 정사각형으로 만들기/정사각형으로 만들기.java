class Solution {
    public int[][] solution(int[][] arr) {
        int maxSize = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[maxSize][maxSize];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}