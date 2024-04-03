class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a%2 != 0 && b%2 != 0) { //모두 홀수일 경우
            a *= a;
            b *= b;
            answer = a + b;
            
        } else if (a%2 == 0 && b%2 == 0) { //모두 짝수일 경우
            if (a > b && a != b) {
                answer = a-b;                
            } else if (b > a && b != a) {
                answer = b-a;
            }
            
        } else if (a%2 != 0 || b%2 != 0 && a > b) { //하나만 홀수, a가 클 경우
            answer = 2 * (a + b);
            
        } else if (a%2 != 0 || b%2 != 0 && a < b) { //하나만 홀수, b가 클 경우
            answer = 2 * (a + b);
            
        }
        
        return answer;
    }
}