/**
 * Author: Shubhangi Srivastava
 * Calculate sum of digits using Recursion
 * eg: n = 123 , so 1+2+3 = 6 should be th output
 */
package recursion_easy;

public class SumOfDigits {
    public static void main(String args[]){
        int ans = sumOfDigits(123);
        System.out.println(ans);
    }
    static int sumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
