import java.util.*;
public class LambdaSort {
    public static void main(String[] a){
        List<String> list=Arrays.asList("Banana","Apple","Cherry");
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
        System.out.println(list);
    }
}
