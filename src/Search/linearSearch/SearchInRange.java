package Search.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19};
        int target = 30;
        System.out.println(linearSearch(arr, target, 0, 5));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        // run for loop
        for (int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
