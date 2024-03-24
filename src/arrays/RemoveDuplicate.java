package arrays;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // Because i represents the last unique element index
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " "); // Print the first k elements (unique values)
        }
    }
}
