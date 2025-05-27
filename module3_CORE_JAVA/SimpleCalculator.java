import java.util.*;
public class SimpleCalculator {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x=s.nextDouble();
        System.out.print("Enter second number: ");
        double y=s.nextDouble();
        System.out.println("Choose operation: +, -, *, /");
        char o=s.next().charAt(0);
        if(o=='+')
            System.out.println("Result: "+(x+y));
        else if(o=='-')
            System.out.println("Result: "+(x-y));
        else if(o=='*')
            System.out.println("Result: "+(x*y));
        else if(o=='/') {
            if(y!=0)
                System.out.println("Result: "+(x/y));
            else 
                System.out.println("Error: Divide by zero");
        }
        else 
            System.out.println("Invalid operator");
        s.close();
    }
}