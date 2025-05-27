import java.util.*;
public class FactorialCalc {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n=s.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
        System.out.println("Factorial of "+n+" is : "+f);
        s.close();
    }
}
