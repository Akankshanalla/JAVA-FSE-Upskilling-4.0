import java.util.*;
public class StudentList {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Enter names (type 'stop' to end):");
        while(true){
            String name=s.nextLine();
            if(name.equals("stop")) break;
            list.add(name);
        }
        System.out.println("Names: "+list);
        s.close();
    }
}
