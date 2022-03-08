import java.lang.reflect.Array;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int[] arr = new int[sc.nextInt()];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.print(arr.length);
    }
}
