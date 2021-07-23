// Moh. Iqbal Waldan
// 15

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
    static DaftarPromo data = new DaftarPromo();
    static int pil;
    static Promo m = new Promo();

    public static void main(String[] args) {
        m = new Promo("Makanan", 20, "Makan Sepuasnya", 20);
        data.tambah(m);
        m = new Promo("Minuman", 30, "Minum Sepuasnya", 30);
        data.tambah(m);
        m = new Promo("Paket Data", 40, "Kuota Internet Sale", 50);
        data.tambah(m);
        pilihanMenu();
        pilihan();
    }

    static void pilihan() {
        switch (pil) {
            case 1:
                data.urutkanNama();
                data.tampil();
                ulang();
                break;
            case 2:
                data.urutkanNama();
                data.tampil();
                System.out.println("Masukkan Nama Promo: ");
                angka.nextLine();
                String nama = angka.nextLine();
                int kode = data.cari(nama);
                if (kode != -1) {
                    System.out.println("==>>> Nama Promo Ditemukan");
                    data.tampilCari(kode);
                    System.out.println("Masukkan Jumlah Yang Akan Digunakan: ");
                    int jum = angka.nextInt();
                    angka.nextLine();
                    data.kurangiStok(kode, jum);
                } else {
                    System.out.println("==!!! Nama Promo Tidak Ditemukan");
                }
                ulang();
                break;
            default:

        }
    }

    static void ulang() {
        System.out.println("Apakah Anda ingin mengulangi? (y/t)");
        char p = angka.next().charAt(0);
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
        System.out.println("1. Daftar Promo");
        System.out.println("2. Menggunakan Promo");
        System.out.print("Masukkan angka menu yang ingin dipilih: ");
        pil = angka.nextInt();
    }

}
