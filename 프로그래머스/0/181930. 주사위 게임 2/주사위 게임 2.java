class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && a!=c && b!=c) {
            answer = a+b+c;
        } else if (a == b && a == c && b == c) {
            int add = a+b+c;
            int doubled = a*a + b*b + c*c;
            int tripled = a*a*a + b*b*b + c*c*c;
            answer = add * doubled * tripled;
        } else {
            answer = (a+b+c) * (a*a + b*b + c*c);
        }
        return answer;
    }
}