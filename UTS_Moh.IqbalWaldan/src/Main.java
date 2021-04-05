// 15_Moh. Iqbal Waldan
// MI 1F

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

    static Scanner angka = new Scanner(System.in);
    static Scanner huruf = new Scanner(System.in);
    static DaftarBarang data = new DaftarBarang();
    static int pil;
    static Barang m = new Barang();

    public static void main(String[] args) {
        pilihanMenu();
        pilihan();
    }

    static void pilihan() {
        switch (pil) {
            case 1:
                menambahBarang(data.listBrg.length);
                ulang();
                break;
            case 2:
                tampilPenjualanBarang();
                ulang();
                break;
            case 3:
                System.out.println("Berikut ini adalah list daftar barang dengan stok terbanyak: ");
                data.sortStok();
                data.tampil();
                ulang();
                break;
            case 4:
                System.out.println("Berikut ini adalah list daftar barang dengan penjualan terbanyak: ");
                data.sortPenjualan();
                data.tampil();
                ulang();
                break;
            case 5:
                data.tampil();
                ulang();
            default:

        }
    }

    static void ulang() {
        System.out.println("Apakah Anda ingin mengulangi?");
        char p = huruf.next().charAt(0);
        switch (p) {
            case 'Y':
            case 'y':
                pilihanMenu();
                pilihan();
                break;
            case 'T':
            case 't':
                System.out.println("Selesai");
                break;
            default:

        }
    }

    static void pilihanMenu() {
        System.out.println("1. Input Barang");
        System.out.println("2. Penjualan Barang");
        System.out.println("3. Cek Stok Barang Terbanyak");
        System.out.println("4. Cek Stok barang Terlaris");
        System.out.println("5. Tampil Barang");
        System.out.print("Masukkan angka menu yang ingin dipilih: ");
        pil = angka.nextInt();
    }

    static void menambahBarang(int jumBrg) {
        System.out.println("Input data Barang");
        for (int i = 0; i < jumBrg; i++) {
            System.out.print("Kode = ");
            String kode = huruf.nextLine();
            System.out.print("Nama = ");
            String nama = huruf.nextLine();
            System.out.print("Stok = ");
            int stok = angka.nextInt();
            System.out.print("Harga = ");
            int harga = angka.nextInt();
            Barang m = new Barang(kode, nama, stok, harga, 0);
            data.tambah(m);
        }
    }

    static void tampilPenjualanBarang() {
        System.out.println("Data Barang Yang ada");
        data.tampil();
        int i = 0;
        int beli[][] = new int[99][2];
        boolean x = true;
        while (x) {
            huruf.nextLine();
            System.out.print("Masukkan kode barang yang akan dibeli = ");
            String cari = huruf.nextLine();
            beli[i][0] = data.cari(cari);
            System.out.print("Masukkan jumlah barang yang akan dibeli = ");
            beli[i][1] = angka.nextInt();
            data.kurangiStok(beli[i][0], beli[i][1]);
            i++;
            System.out.println("Apakah anda ingin menambah barangyang dibeli?");
            char p = huruf.next().charAt(0);
            switch (p) {
                case 'Y':
                case 'y':
                    x = true;
                    break;
                case 'T':
                case 't':
                    x = false;
                    break;
                default:
            }
        }
        int total = 0;
        int jumlahTotal = 0;
        for (int j = 0; j < i; j++) {
            System.out.println("--------------------------------------------");
            total = data.listBrg[beli[j][0]].hargaBrg * beli[j][1];
            jumlahTotal+=total;
            System.out.println("Kode\t|Nama\t|Jumlah\t|Harga\t|Total Harga");
            System.out.printf("%s \t| %s \t| %d \t| %d \t| %d\n", data.listBrg[beli[j][0]].kodeBrg, data.listBrg[beli[j][0]].namaBrg, beli[j][1], data.listBrg[beli[j][0]].hargaBrg, total);
        }
        System.out.println("Total Bayar = " + jumlahTotal);
    }
}
