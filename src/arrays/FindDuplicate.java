package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate{
    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // Should never reach here if there's a duplicate
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int k = findDuplicate(nums);
        System.out.println(k);
    }
}
