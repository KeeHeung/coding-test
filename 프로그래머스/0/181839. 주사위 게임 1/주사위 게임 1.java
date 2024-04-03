class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a%2 != 0 && b%2 != 0) answer = (a*a) + (b*b);
        else if (a%2 == 0 && b%2 == 0) {
            if (a > b && a != b) {
                answer = a-b;                
            } else if (b > a && b != a) {
                answer = b-a;
            }
        }
        else answer = 2 * (a + b);
        return answer;
    }
}