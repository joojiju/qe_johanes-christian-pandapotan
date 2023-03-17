package soalPrioritas1;

public class nomor1 {
    public static void main(String[] args) {
        // Segitiga
        double alas = 20;
        double tinggi = 15;
        double luasSegitiga, luasPersegipanjang, luasLingkaran;

        luasSegitiga = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga : " +luasSegitiga);

        // Persegi Panjang
        double panjang = 40;
        double lebar = 6;

        luasPersegipanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang : " +luasPersegipanjang);

        // Lingkaran
        double jariJari = 7;
        final double phi = 3.14;
        luasLingkaran = phi*jariJari*jariJari;
        System.out.println("Luas Lingkaran : " +luasLingkaran);

    }
}
