class Solution {
    public int solution(int[] num_list) {
        int oddAdd = 0;
        int evenAdd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddAdd += num_list[i];
            } else if (i % 2 != 0) {
                evenAdd += num_list[i];   
            }
        }
        return oddAdd > evenAdd ?oddAdd : evenAdd;
    }
}