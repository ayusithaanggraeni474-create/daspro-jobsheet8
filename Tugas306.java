import java.util.Scanner;

public class Tugas306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        int totalSemuaBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1, coba lagi.");
            }
        } while (jumlahToko < 1);

        String ringkasan = "";

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;
            int totalBarangToko = 0;

            do {
                System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif, coba lagi. ");
                }
            } while (jumlahPelanggan < 0);

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                
                do {
                    System.out.print(" Pelanggan " + pelanggan + " - jumlah barang: ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println(" Tidak boleh negatif, coba lagi.");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;

                totalSemuaBarang += jumlahBarang;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }
                ringkasan += "Toko " + toko + " - pelanggan: "
                 + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
        }
            System.out.println();
            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
            sc.close();
    }
}
