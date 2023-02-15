/**
 * Author: Shubhangi Srivastava
 * Calculate product of digits using Recursion
 * eg: n = 123 , so 1*2*3 = 6 should be th output
 */
package recursion_easy;

public class ProductOfDigits {
    public static void main(String args[]){
        int ans = prodOfDigits(568);
        System.out.println(ans);
    }
    static int prodOfDigits(int n) {
        if(n %10 == n){
            return n;
        }
        return (n%10) * prodOfDigits(n/10);
    }
}
