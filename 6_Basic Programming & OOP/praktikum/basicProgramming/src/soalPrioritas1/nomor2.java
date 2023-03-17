package soalPrioritas1;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaBeli, hargaJual, hasil;

        // Input Harga
        System.out.print("Harga Beli : ");
        hargaBeli = input.nextInt();
        System.out.print("Harga Jual : ");
        hargaJual = input.nextInt();

        // Perhitungan
        hasil = hargaJual-hargaBeli;

        if (hasil > 0) {
            System.out.println("Untung Sebesar : " +hasil);
        } else if (hasil < 0) {
            System.out.println("Rugi Sebesar : " +hasil);
        } else {
            System.out.println("Sama Saja");
        }
    }
}
