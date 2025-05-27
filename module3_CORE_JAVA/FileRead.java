import java.io.*;
public class FileRead {
    public static void main(String[] a){
        try{
            BufferedReader br=new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line=br.readLine())!=null)
                System.out.println(line);
            br.close();
        }catch(Exception e){System.out.println("Error");}
    }
}
