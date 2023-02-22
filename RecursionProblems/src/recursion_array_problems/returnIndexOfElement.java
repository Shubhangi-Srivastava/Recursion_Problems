/*
 * Author: Shubhangi Srivastava
 * Find index of the element if the element exists in the array
 */
package recursion_array_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class returnIndexOfElement {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 4, 4, 6, 7 };
        returnIndexOfElement obj = new returnIndexOfElement();
        ArrayList<Integer> list = new ArrayList<>();
        list = obj.findIndex(nums, 4, 0, new ArrayList<>());
        System.out.println(Arrays.asList(list));
    }

    // static ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> findIndex(int nums[], int target, int i, ArrayList<Integer> list) {
        if (i == nums.length) {
            return list;
        }
        if (nums[i] == target) {
            list.add(i);
        }
        return findIndex(nums, target, i + 1, list);
    }
}
