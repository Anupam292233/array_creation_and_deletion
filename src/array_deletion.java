import java.util.Scanner;

public class array_deletion {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an Array");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter index of value to be deleted");
        m = sc.nextInt();

        if (m < 0 || m >= n) {
            System.out.println("Invalid index");
            return;
        }

        int b[] = new int[n - 1];
        int j = 0; // Index for the new array 'b'

        for (int i = 0; i < n; i++) {
            if (i == m) {
                continue; // Skip the element at the specified index
            }
            b[j] = a[i];
            j++;
        }

        System.out.println("Elements after deletion:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
