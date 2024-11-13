package swvalerian.twosum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                Integer i2 = hashMap.get(target - nums[i]);
                return new int[] {i, i2};
            }

            hashMap.put(nums[i], i);
        }

        return null;
    }
}
