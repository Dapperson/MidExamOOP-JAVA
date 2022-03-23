package data;

import java.util.Scanner;

public class Laptop {

    // NO 1
    private String nama, brand, nProcessor, jcProcessor, so, ram, jStorage, stok;

    Scanner input = new Scanner(System.in);
    // NO1

    public String storage, ket;

    // NO 1
    public Laptop() {
        this.setNama();
        this.setBrand();
        this.setProcessor();
        this.setJCProcessor();
        this.setSO();
        this.setRam();
        this.setJStorage();
        this.setStok();
    }

    public Laptop(String nama, String brand, String nProcessor, String jcProcessor, String so, String ram,
            String jStorage, String stok) {
        this.nama = nama;
        this.brand = brand;
        this.nProcessor = nProcessor;
        this.jcProcessor = jcProcessor;
        this.so = so;
        this.ram = ram;
        this.jStorage = jStorage;
        this.stok = stok;
    }

    public void setStok() {
        System.out.println("Jumlah Stok             : ");
        this.stok = input.nextLine();
    }

    public String getStok() {
        return stok;
    }

    public void setJStorage() {
        System.out.println("Besar Penyimpanan       : ");
        this.jStorage = input.nextLine();
    }

    public String getJStorage() {
        return jStorage;
    }

    public void setRam() {
        System.out.println("Besar RAM               : ");
        this.ram = input.nextLine();
    }

    public String getRam() {
        return ram;
    }

    public void setSO() {
        System.out.println("Sistem Operasi          : ");
        this.so = input.nextLine();
    }

    public String getSO() {
        return so;
    }

    public void setJCProcessor() {
        System.out.println("Jumlah Core Processor   : ");
        this.jcProcessor = input.nextLine();
    }

    public String getJCProcessor() {
        return jcProcessor;
    }

    public void setProcessor() {
        System.out.println("Processor               : ");
        this.nProcessor = input.nextLine();
    }

    public String getProcessor() {
        return nProcessor;
    }

    public void setBrand() {
        System.out.println("Brand                   : ");
        this.brand = input.nextLine();
    }

    public String getBrand() {
        return brand;
    }

    public void setNama() {
        System.out.println("Nama                    : ");
        this.nama = input.nextLine();
    }

    public String getNama() {
        return nama;
    }

    // NO 1

    public void storage() {

        if (storage == "SSD M.2") {
            ket = "Best";
        } else if (this.storage == "SSD SATA") {
            ket = "Good";
        } else {
            ket = "Middle";
        }
    }
}