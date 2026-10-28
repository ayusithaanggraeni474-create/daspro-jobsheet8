import java.util.Scanner;

public class Tugas206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int jumlah = 0;

        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("n minimal 3, coba lagi.");
            }
        } while (n < 3);

        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                int hasil = baris * kolom;
                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}
