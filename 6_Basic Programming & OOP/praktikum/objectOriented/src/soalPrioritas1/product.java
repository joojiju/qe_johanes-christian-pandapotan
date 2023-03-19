package soalPrioritas1;

public class product {
    private String nama, desc;
    private int harga, stok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void getInfo() {
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama : " +getNama());
        System.out.println("deskripsi : " +getDesc());
        System.out.println("harga : " +getHarga());
        System.out.println("jumlah stok : " +getStok());
        System.out.println("===");
    }
}
