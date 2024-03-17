class Solution {
    public int solution(int angle) {
        
        int answer = 0;
        while (angle > 0 && angle <= 180) {
            if (angle > 0 && angle < 90) {
                answer = 1;
                break;
            } else if (angle == 90) {
                answer = 2;
                break;
            } else if (angle > 90 && angle < 180) {
                answer = 3;
                break;
            } else {
                answer = 4;
                break;
            } 
        }

        return answer;
    }
}