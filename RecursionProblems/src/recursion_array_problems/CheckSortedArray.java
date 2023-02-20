/*
 * Author: Shubhangi Srivastava
 * Check if Array is sorted or not
 * Naturally, this can be done by Linear search but here's the iterative way to do it.
 */
package recursion_array_problems;

public class CheckSortedArray {
    public static void main(String args[]) {
        int nums[] = { 1, 4, 6, 8, 9, 12 };
        System.out.println(checkArray(nums, 0));
    }

    static boolean checkArray(int nums[], int index) {
        if (index == nums.length - 1) {
            return true;
        }
        return nums[index] < nums[index + 1] && checkArray(nums, index + 1);
    }
}