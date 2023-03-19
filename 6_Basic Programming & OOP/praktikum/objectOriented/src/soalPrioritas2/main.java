package soalPrioritas2;

public class main {
    public static void main(String[] args) {
        kalkulator kalkulator = new kalkulator();

        System.out.println("Penjumlahan : " +kalkulator.add(3,4));
        System.out.println("Pengurangan : " +kalkulator.substract(15,4));
        System.out.println("Perkalian : " +kalkulator.multiply(10,10));
        System.out.println("Pembagian : " +kalkulator.divide(12,3));
    }
}
