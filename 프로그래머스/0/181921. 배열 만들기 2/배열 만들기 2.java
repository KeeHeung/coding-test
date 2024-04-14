import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> numList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String[] nums = String.valueOf(i).split("");
            int cnt = 0;    
            for (int j = 0; j < nums.length; j++) {
                if (nums[j].equals("0") || nums[j].equals("5")) {
                    cnt++;   
                }
            }
            if (cnt == nums.length) {
                numList.add(i);
            }    
        }
        if (numList.isEmpty()) numList.add(-1);
        
        int[] res = new int[numList.size()];
		for (int i = 0; i < numList.size(); i++) {
			res[i] = numList.get(i);
		}
        
        return res;
    }
}