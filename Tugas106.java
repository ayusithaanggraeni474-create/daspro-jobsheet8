import java.util.Scanner;

public class Tugas106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;

        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n minimal 1, coba lagi.");
            }
        } while (n < 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                total++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}
