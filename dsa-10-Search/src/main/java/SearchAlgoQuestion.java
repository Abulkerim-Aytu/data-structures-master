public class SearchAlgoQuestion {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println(searchIterative(arr, 9));
        System.out.println(searchRecursive(arr, 9));
    }

    public static int searchIterative(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // Calculate Middle
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (target < nums[middle]) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }

    public static int searchRecursive(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }
    public static int searchRecursive(int[] nums, int target, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (nums[middle] == target) return middle;
        if (nums[middle] > target) return searchRecursive(nums, target, left, right = middle - 1);
        else return searchRecursive(nums, target, left = middle + 1, right);
    }
}
