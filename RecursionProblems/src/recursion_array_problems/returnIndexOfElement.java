/*
 * Author: Shubhangi Srivastava
 * Find index of the element if the element exists in the array
 */
package recursion_array_problems;

import java.util.ArrayList;

public class returnIndexOfElement {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 4, 4, 6, 7 };
        findIndex(nums, 4, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findIndex(int nums[], int target, int i) {
        if (i == nums.length) {
            return;
        }
        if (nums[i] == target) {
            list.add(i);
        }
        findIndex(nums, target, i + 1);
    }
}
