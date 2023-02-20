/**
 * Author: Shubhangi Srivastava
 * Leetcode: 1342. Number of Steps to Reduce a Number to Zero
 */
package recursion_easy;

public class leetcode1342 {
    public static void main(String args[]) {
        int num = 123;
        leetcode1342 obj = new leetcode1342();
        int count = obj.numberOfSteps(num);
        System.out.println(count);
    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public int helper(int num, int count) {
        if (num == 0) {
            return count;
        }

        if (num % 2 == 0) {
            return helper(num / 2, count + 1);
        } else
            return helper(num - 1, count + 1);

    }

}
