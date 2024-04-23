import java.util.*;
import static java.util.Arrays.copyOfRange;

class Solution {
    public int solution(int[] arr) {

		int count = 0;
		int[] tempBefore = copyOfRange(arr, 0, arr.length);
		int[] tempAfer = copyOfRange(tempBefore, 0, tempBefore.length);

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				int idxNum = tempBefore[i];
				if (idxNum >= 50 && idxNum % 2 == 0) tempBefore[i] = idxNum / 2;
				else if (idxNum < 50 && idxNum % 2 != 0) tempBefore[i] = idxNum * 2 + 1;
				else tempBefore[i] = idxNum;
			}

			for (int i = 0; i < arr.length; i++) {
				int idxNum = tempBefore[i];
				if (idxNum >= 50 && idxNum % 2 == 0) tempAfer[i] = idxNum / 2;
				else if (idxNum < 50 && idxNum % 2 == 0) tempAfer[i] = idxNum;
				else if (idxNum < 50 && idxNum % 2 != 0) tempAfer[i] = idxNum * 2 + 1;
				else tempAfer[i] = idxNum;
			}
			if (Arrays.equals(tempBefore, tempAfer)) {
				if(count != 0) {
					count++;
					break;
				} else {
					break;
				}
			} else {count++;}

		}
        return count;
    }
}