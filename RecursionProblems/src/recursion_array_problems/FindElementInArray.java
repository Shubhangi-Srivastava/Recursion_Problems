package recursion_array_problems;

public class FindElementInArray {
    public static void main(String args[]) {
        int nums[] = { 1, 4, 6, 8, 9, 12 };
        System.out.println(findElement(nums, 9, 0));
    }

    static boolean findElement(int nums[], int target, int i) {
        if (i == nums.length) {
            return false;
        } else
            return nums[i] == target || findElement(nums, target, i + 1);
    }
}
