package soalPrioritas1;

public class main {
    public static void main(String[] args) {
        // Data Produk 1
        product product1 = new product();
        product1.setNama("coffee");
        product1.setDesc("this is coffee");
        product1.setHarga(15000);
        product1.setStok(10);
        // Data Produk 2
        product product2 = new product();
        product2.setNama("milk");
        product2.setDesc("this is fresh milk");
        product2.setHarga(25000);
        product2.setStok(10);
        // Data Produk 3
        product product3 = new product();
        product3.setNama("apple juice");
        product3.setDesc("this is juice");
        product3.setHarga(18000);
        product3.setStok(20);

        product1.getInfo();
        product2.getInfo();
        product3.getInfo();
    }
}
