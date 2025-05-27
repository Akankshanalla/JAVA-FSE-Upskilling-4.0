import java.util.*;
public class MultiplicationTable {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" x "+i+" = "+(n*i));
        s.close();
    }
}