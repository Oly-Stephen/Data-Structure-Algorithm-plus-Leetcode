package arrays;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {

        int start=1;
        int end=1;
        while(end<nums.length){
            if(nums[end] != nums[end-1]){
                nums[start] = nums[end];
                start++;
            }
            end++;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }
}

