import java.util.*;
public class EvenOrOdd {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        if(n%2==0)
            System.out.println(n+" is even.");
        else 
            System.out.println(n+" is odd.");
        s.close();
    }
}