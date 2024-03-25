class Solution {
    public int solution(int a, int b) {
        String num1 = Integer.toString(a) + Integer.toString(b);
        String num2 = Integer.toString(b) + Integer.toString(a);
        int aAddB = Integer.parseInt(num1);
        int bAddA = Integer.parseInt(num2);
        return  aAddB > bAddA ?aAddB :bAddA;
    }
}