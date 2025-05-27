import java.util.*;
public class RecursiveFibo {
    static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=s.nextInt();
        System.out.println("Fibonacci("+n+"): "+fib(n));
        for(int i=0;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
        s.close();
    }
}
