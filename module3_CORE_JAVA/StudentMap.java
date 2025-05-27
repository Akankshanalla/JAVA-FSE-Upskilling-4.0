import java.util.*;
public class StudentMap {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("Enter ID and name (ID -1 to stop):");
        while(true){
            int id=s.nextInt();
            if(id==-1) break;
            s.nextLine();
            String name=s.nextLine();
            map.put(id,name);
        }
        System.out.print("Enter ID to search: ");
        int key=s.nextInt();
        System.out.println("Name: "+map.getOrDefault(key,"Not found"));
        s.close();
    }
}
