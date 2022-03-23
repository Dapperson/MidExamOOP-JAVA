package data;

public class Lenovo extends Laptop {

    int harga = 0;

    public Lenovo(String nama, String brand, String nProcessor, String jcProcessor, String so, String ram,
            String jStorage, String stok, String storage) {
        super(nama, brand, nProcessor, jcProcessor, so, ram, jStorage, stok);
        this.storage = storage;
    }

    public int getHarga() {
        return harga = 30_000_000;
    }

    public String toString() {
        storage();
        return "\nNama                   : " + getNama() + "\n" +
                "Brand                  : " + getBrand() + "\n" +
                "Nama Processor         : " + getProcessor() + "\n" +
                "Jumlah Core Processor  : " + getJCProcessor() + "\n" +
                "Sistem Operasi         : " + getSO() + "\n" +
                "RAM                    : " + getRam() + "\n" +
                "Jumlah Storage         : " + getJStorage() + "\n" +
                "Stok                   : " + getStok() + "\n" +
                "Harga                  : " + getHarga() + "\n" +
                "Storage Type           : " + storage + "\n" +
                "Storefront Position    : " + ket;
    }
}
