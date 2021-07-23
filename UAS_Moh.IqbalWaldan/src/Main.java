// 15_MOH. IQBAL WALDAN
// MI1F

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Main {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Lihat Daftar Produk");
        System.out.println("2. Membeli Produk");
        System.out.println("3. Tampil Data Pembelian");
        System.out.println("4. Mengurutkan Data Pembelian");
        System.out.println("5. Keluar");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLLProduk dllPr = new DLLProduk();
        DLLPembelian dllPb = new DLLPembelian();
        dllPr.addLastProduk("1", "Pulsa", "Telkomsel", 10);
        dllPr.addLastProduk("2", "Pulsa", "Indosat", 10);
        dllPr.addLastProduk("3", "Pulsa", "Telkomsel", 20);
        dllPr.addLastProduk("4", "Pulsa", "Indosat", 20);
        dllPr.addLastProduk("5", "Paket", "Telkomsel", 50);
        dllPr.addLastProduk("6", "Paket", "Indosat", 50);
        dllPr.addLastProduk("7", "Paket", "Telkomsel", 100);
        dllPr.addLastProduk("8", "Paket", "Indosat", 100);
        int k = 1;
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("List Produk");
                    dllPr.printProduk();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Menapilkan barang yang dijual");
                    dllPr.printProduk();
                    System.out.print("Masukkan Kode Produk: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nominal: ");
                    int nom = sc.nextInt();
                    System.out.println("Pilih Metode Pembayaran: ");
                    System.out.println("1. Tunai");
                    System.out.println("2. OVO");
                    System.out.println("3. GoPay");
                    System.out.println("4. ShopeePay");
                    System.out.println("5. Debit");
                    System.out.print("Masukkan Metode: ");
                    int met = sc.nextInt();
                    int harga = dllPr.cariHargaProduk(kode, nom);
                    dllPb.addLastPembelian(k++, harga, met);
                    break;
                case 3:
                    dllPb.printPembelian();
                    System.out.println("");
                    break;
                case 4:
                    dllPb.mengurutkan();
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("");
                    break;
                default:
                    System.out.println("Pilihan Menu Yang Anda Masukkan Tidak Ditemukan");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
