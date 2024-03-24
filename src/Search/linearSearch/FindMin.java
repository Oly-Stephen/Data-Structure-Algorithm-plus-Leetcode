package Search.linearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
