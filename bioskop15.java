import java.util.Scanner;

public class bioskop15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (0 untuk keluar): ");
            int jmlTiket = input.nextInt();
            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Input tidak valid! Silakan masukkan ulang.\n");
                continue;
            }
            double totalHarga = jmlTiket * hargaTiket;
            if (jmlTiket > 10) {
                totalHarga *= 0.85; 
            } else if (jmlTiket > 4) {
                totalHarga *= 0.90; 
            }
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga + "\n");
            totalTiket += jmlTiket;
            totalPenjualan += totalHarga;
        }
        System.out.println("=== Rangkuman Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPenjualan);
    }
}
