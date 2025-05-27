import java.util.*;
public class PalindromeChk {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=s.nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev)?"It is a Palindrome":"It is not a palindrome");
        s.close();
    }
}
