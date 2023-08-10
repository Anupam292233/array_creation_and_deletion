import java.util.Scanner;

public class array_creation {
    public static void main(String[] args) {
        int n, m, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an Array");
        n = sc.nextInt();
        int a[] = new int[n + 1]; // Increase the size of 'a' array to hold 'n+1' elements

        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index of the new value to be inserted");
        m = sc.nextInt();
        System.out.println("Enter the new value to be inserted");
        p = sc.nextInt();

        // Shift elements to make space for the new element
        for (int i = n; i > m; i--) {
            a[i] = a[i - 1];
        }
        a[m] = p; // Insert the new value at the specified index

        System.out.println("Elements are:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(a[i]);
        }
    }
}
