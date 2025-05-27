import java.io.*;
import java.util.*;
public class FileWrite {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter text: ");
        String str=s.nextLine();
        try{
            FileWriter fw=new FileWriter("output.txt");
            fw.write(str);
            fw.close();
            System.out.println("Data written to output.txt");
        }catch(Exception e){System.out.println("Error");}
        s.close();
    }
}
