import java.util.*;
public class TryCatch {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x=s.nextInt(), y=s.nextInt();
        try {
            int r=x/y;
            System.out.println("Result: "+r);
        } catch(ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        s.close();
    }
}