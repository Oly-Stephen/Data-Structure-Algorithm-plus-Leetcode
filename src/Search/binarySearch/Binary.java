package Search.binarySearch;

public class Binary {
    static int binarySearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = -12;
        System.out.println(binarySearch(arr,target));
    }
}
