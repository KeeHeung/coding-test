class Solution {
    public int solution(int n) {
        int answer = 0;
        double que = Math.sqrt(n);
        return que%1 == 0 ? 1 : 2;
    }
}