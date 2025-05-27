import java.util.*;
public class StringReverse {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=s.nextLine();
        StringBuilder r=new StringBuilder(str);
        System.out.println("Reversed: "+r.reverse());
        s.close();
    }
}
