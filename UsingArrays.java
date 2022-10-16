import java.util.Scanner;

/**
 * Created by students on 25/09/22.
 */
public class UsingArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
