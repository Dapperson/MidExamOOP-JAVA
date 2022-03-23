package data;

public class LaptopApp {
        public static void main(String[] args) {

                // NO 1

                Laptop hasil = new Laptop();

                System.out.println("Nama                    : " + hasil.getNama());
                System.out.println("Brand                   : " + hasil.getBrand());
                System.out.println("Processor               : " + hasil.getProcessor());
                System.out.println("Jumlah Core Processor   : " + hasil.getJCProcessor());
                System.out.println("Sistem Operasi          : " + hasil.getSO());
                System.out.println("Besar RAM               : " + hasil.getRam());
                System.out.println("Besar Penyimpanan       : " + hasil.getJStorage());
                System.out.println("Jumlah Stok             : " + hasil.getStok());
                System.out.println("\n");

                Laptop hasil1 = new Laptop("Pavillion Gaming Laptop 15-EC2010AX", "HP", "AMD Ryzen 5 5600H", "6 Cores",
                                "Windows 10", "16 GB", "512 GB", "10");
                System.out.println("Nama                    : " + hasil1.getNama());
                System.out.println("Brand                   : " + hasil1.getBrand());
                System.out.println("Processor               : " + hasil1.getProcessor());
                System.out.println("Jumlah Core Processor   : " + hasil1.getJCProcessor());
                System.out.println("Sistem Operasi          : " + hasil1.getSO());
                System.out.println("Besar RAM               : " + hasil1.getRam());
                System.out.println("Besar Penyimpanan       : " + hasil1.getJStorage());
                System.out.println("Jumlah Stok             : " + hasil1.getStok());
                System.out.println("\n");

                // NO 1

                Lenovo hasil2 = new Lenovo("Alienware m15 R7 Gaming Laptop", "Dell", "12th Gen Intel Core i7-12700H",
                                "16 Cores", "Windows 11", "16 GB", "512 GB", "4", "SSD M.2");
                System.out.println(hasil2);

                HP hasil3 = new HP("Idea PadIdeaPad Gaming 3 (16'', Gen 7)", "Lenovo",
                                "AMD Ryzen 7 6800H Mobile Processor",
                                "8 Cores", "Windows 10", "16 GB", "1 TB", "8", "SSD SATA");
                System.out.println(hasil3);
        }
}
