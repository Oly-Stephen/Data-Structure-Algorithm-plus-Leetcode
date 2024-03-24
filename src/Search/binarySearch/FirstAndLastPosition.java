//package Search.binarySearch;
//
//public class FirstAndLastPosition {
//    static int[] firstAndLastPos(int[] nums, int target) {
//
//        int[] ans = {-1, -1};
//
//        // check for the
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
//        int target = -12;
//        System.out.println(firstAndLastPos(arr,target));
//        }
//    }
//}