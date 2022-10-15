import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = 0;
        int avg = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            avg += arr[i];
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }

        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sum: " + avg);
        System.out.println("avg: " + avg / n);


    }
}
