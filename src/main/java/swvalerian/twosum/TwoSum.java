package swvalerian.twosum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                int firstIndex = hashMap.get(target - nums[i]);
                return new int[] {firstIndex, i};
            }

            hashMap.put(nums[i], i);
        }

        return null;
    }
}
