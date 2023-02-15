/**
 * Author: Shubhangi Srivastava
 * Basic problem to understand what is happening in the stack.
 * F(5) executes 5 and instructs f(4) to work on the rest of the execution meanwhile f(5) waits for f(4) to 
 * complete in the stack. This goes on till f(1). Once all is done, return throws out f(1) to f(5) from the stack.
 * So every function waits till the other is complete.
 */
package recursion_easy;

public class Nto1 {
    public static void main(String args[]){
        fun(5);
   }
    static void fun(int n){
        //base condition is a must in Recursion
        if(n == 1){ //once it reaches 1, print 1 and stop everything
            System.out.println(n);
            return;
        }

        System.out.print(n); //print the number 
        fun(n-1);  // and call the provious number
      }
}

