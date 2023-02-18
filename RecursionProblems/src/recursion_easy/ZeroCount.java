package recursion_easy;

public class ZeroCount {
    public static void main(String args[]){
        int count = 0;
        int ans = countZero(20238902,count);
        System.out.println(ans);
    }
    static int countZero(int n, int count){
        
        if(n%10==n){
            return count;
        }
        int r = n % 10;
        if(r == 0){
            return countZero(n/10, count+1);
        }
        else return countZero(n/10, count);
    }
}
