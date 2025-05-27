import java.util.*;
public class GradeCalc {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int m=s.nextInt();
        if(m>=90)
            System.out.println("Grade: A");
        else if(m>=80)
            System.out.println("Grade: B");
        else if(m>=70)
            System.out.println("Grade: C");
        else if(m>=60)
            System.out.println("Grade: D");
        else 
            System.out.println("Grade: F");
        s.close();
    }
}