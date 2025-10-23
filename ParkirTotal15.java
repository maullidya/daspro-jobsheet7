   import java.util.Scanner;

public class ParkirTotal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break; // keluar dari loop
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!\n");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else {
                if (jenis == 1) { // mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // motor
                    total += durasi * 2000;
                }
            }

            System.out.println("Subtotal parkir saat ini: Rp " + total + "\n");
        }

        System.out.println("==================================");
        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
        System.out.println("==================================");
    }
}
