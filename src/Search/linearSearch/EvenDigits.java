package Search.linearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, 1764, 98, 1};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        // check if array is empty
        if (nums.length == 0){
            return -1;
        }

        int count  = 0;
        // run for loop
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
