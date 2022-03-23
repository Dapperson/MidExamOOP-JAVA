package application;

import data.Laptop;

public class Application {
    public static void main(String[] args) {

        Laptop summon = new Laptop();
        {
            System.out.println("Nama                    : " + summon.getNama());
            System.out.println("Brand                   : " + summon.getBrand());
            System.out.println("Processor               : " + summon.getProcessor());
            System.out.println("Jumlah Core Processor   : " + summon.getJCProcessor());
            System.out.println("Sistem Operasi          : " + summon.getSO());
            System.out.println("Besar RAM               : " + summon.getRam());
            System.out.println("Besar Penyimpanan       : " + summon.getJStorage());
            System.out.println("Jumlah Stok             : " + summon.getStok());
        }
    }
}
