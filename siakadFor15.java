import java.util.Scanner;

public class siakadFor15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double nilai, tertinggi, terendah;
       int lulus=0, tidakLulus=0;
       tertinggi = 100;
       terendah = 0;
       for (int i = 1; i <= 10; i++)
       {
        System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }

        if (60 > nilai) {
        lulus++;
       }else {
        tidakLulus++;
       }
       }

       
       System.out.println("Nilai Tertinggi: " + tertinggi);
       System.out.println("Nilai Terendah: " + terendah);
       System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
       System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);
    }
}