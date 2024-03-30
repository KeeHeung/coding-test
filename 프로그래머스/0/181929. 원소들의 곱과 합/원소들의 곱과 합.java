class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int multiple = 1;
        for (int i = 0; i < num_list.length; i++) {
            add += num_list[i];
            multiple *= num_list[i];
        }
        int addMul = add * add;
        return addMul > multiple ?1 :0;
    }
}