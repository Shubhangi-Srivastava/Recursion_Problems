/**
 * Author: Shubhangi Srivastava
 * Basic String Recursion Question
 * Remove the specified element from the String and return the updated String
 */
package recursion_subsetsStringsSubsequence;

public class RemoveElementAndReturnString {
    public static void main(String args[]) {
        String s = "jhdfbdhsa";
        RemoveElementAndReturnString obj = new RemoveElementAndReturnString();
        String ans = obj.removeEle(s, 0, new StringBuilder());
        System.out.println(ans);
    }

    public String removeEle(String s, int i, StringBuilder sb) {
        if (s.isEmpty() || i == s.length()) {
            return sb.toString();
        }

        if (s.charAt(i) != 'a') {
            removeEle(s, i + 1, sb.append(s.charAt(i)));
        } else {
            removeEle(s, i + 1, sb);
        }
        return sb.toString();
    }
}
