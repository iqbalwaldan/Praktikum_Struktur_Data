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
public class BukuMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PengaturanBuku pb = new PengaturanBuku();
        int id1 = 4;
        for (int i = 0; i < id1; i++) {
            System.out.print("Judul Buku = ");
            String judul = sc.nextLine();
            System.out.print("Jumlah Halaman Buku = ");
            int halaman = sc.nextInt();
            System.out.print("Ukuran Buku = ");
            sc.nextLine();
            String ukuran = sc.nextLine();
            Buku bk = new Buku(judul, halaman, ukuran);
            pb.tambah(bk);
        }
        System.out.println("-----------------------");
        System.out.println("Urutan Data Buku asc = ");
        pb.mengurutkanHalamanBuku();
        pb.mengurutkanUkuranBuku();
        pb.tampil();
    }
}
