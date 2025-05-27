import java.util.*;
public class GuessGame {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=(int)(Math.random()*100)+1;
        int g=0;
        System.out.println("Guess a number between 1 and 100:");
        while(g!=n){
            System.out.print("Your guess: ");
            g=s.nextInt();
            if
                (g<n)System.out.println("Too low");
            else if
                (g>n)System.out.println("Too high");
            else 
                System.out.println("Correct! The number was "+n);
        }
        s.close();
    }
}