public class Practice {

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        int ans = arr[0];
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19};
        int target = 45;
        System.out.println(linearSearch(arr, target, 0, 4));
    }
}
