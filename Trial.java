import java.util.*;
public class Trial {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j = 0;j<10;j++){
            System.out.println(arr[j]);
        }
    }
}
