import java.util.Scanner;
class Solution {
    public static int fib(int n) {
        
        if(n == 0 || n == 1){
            return n;
        }
        
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(fib(num));
    }
}
