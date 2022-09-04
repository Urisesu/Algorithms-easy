package util;

import challenge.TwoSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestTwoSum {
    public void test() {
        TwoSum ts = new TwoSum();

        System.out.println(Arrays.toString(ts.twoSum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(ts.twoSum(new int[] {3,2,4}, 6)));
        System.out.println(Arrays.toString(ts.twoSum(new int[] {3,3}, 6)));
    }
}
