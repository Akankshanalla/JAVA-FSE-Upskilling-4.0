import java.util.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){super(msg);}
}
public class InvalidAgeDemo {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=s.nextInt();
        try{
            if(age<18) throw new InvalidAgeException("Age less than 18");
            System.out.println("Valid age");
        }catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }
        s.close();
    }
}
