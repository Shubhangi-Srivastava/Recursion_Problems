/**
 * Author: Shubhangi Srivastava
 * Leetcode: Hard: 273 Convert Integer to English Words
 * Very important asked in Meta phone call interview 
 * Pattern used: Divide and Conquer
 */

package recursion_leetcode;

public class IntegerToEnglishWords {
    // Divide and Conquer using Recursion
    private String[] under20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Ninteen" };
    private String[] under100 = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };

    public static void main(String args[]) {
        int num = 1234567;
        String ans = "";
        IntegerToEnglishWords obj = new IntegerToEnglishWords();
        ans = obj.helper(num);
        System.out.println(ans);
    }

    public String numberToWords(int num) {

        return num == 0 ? "Zero" : helper(num);
    }

    private String helper(int num) {
        StringBuilder result = new StringBuilder();
        if (num < 20)
            result.append(under20[num]);
        else if (num < 100)
            result.append(under100[num / 10]).append(" ").append(helper(num % 10));
        else if (num < 1000)
            result.append(helper(num / 100)).append(" Hundred ").append(helper(num / 100));
        else if (num < 1000000)
            result.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
        else if (num < 1000000000)
            result.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
        else
            result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
        return result.toString().trim();
    }
}
