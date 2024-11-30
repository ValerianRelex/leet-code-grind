package swvalerian.twosum;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum_case1() {
        int[] nums = new int[] {2, 6, 8, 9, 7};
        int target = 9;

        int[] result =  TwoSum.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void twoSum_case2(){
        int[] nums = {3, 2, 20, 4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    void twoSum_case3(){
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}