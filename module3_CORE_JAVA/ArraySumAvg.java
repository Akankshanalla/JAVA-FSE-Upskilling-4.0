import java.util.*;
public class ArraySumAvg {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=s.nextInt();
        int sum=0;
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        double avg=(double)sum/n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        s.close();
    }
}
