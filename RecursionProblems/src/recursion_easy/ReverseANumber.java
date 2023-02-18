package recursion_easy;

public class ReverseANumber {
   
    static int rev = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int r = n % 10;
        rev = rev * 10 + r;
        reverse(n/10);
    }
    public static void main(String args[]){
        reverse(123);
        System.out.println(rev);
    }
}
