package challenge;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> hashvalues = new HashMap<>();

        for (int i = 0, j = nums.length; i < j; i++) {
            int tmp = target - nums[i];

            if (hashvalues.containsKey(tmp)) {
                res[0] = hashvalues.get(tmp);
                res[1] = i;
                return res;
            }

            hashvalues.put(nums[i], i);
        }

        return res;
    }
}
