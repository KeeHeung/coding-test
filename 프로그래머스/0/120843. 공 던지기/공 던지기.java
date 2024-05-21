class Solution {
    public int solution(int[] numbers, int k) {
        int friends = numbers.length;
        return numbers[((k - 1) * 2) % friends];
    }
}