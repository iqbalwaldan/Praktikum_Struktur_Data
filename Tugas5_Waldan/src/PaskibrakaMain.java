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
public class PaskibrakaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarAnggotaPaskibraka angPas = new DaftarAnggotaPaskibraka();
        int jumPas = 10;
        for (int i = 0; i < jumPas; i++) {
            System.out.print("Nama = ");
            String nama = sc.nextLine();
            System.out.print("Kelas = ");
            String kelas = sc.nextLine();
            System.out.print("Tinggi = ");
            int tinggi = sc.nextInt();
            sc.nextLine();
            Paskibraka m = new Paskibraka(nama, kelas, tinggi);
            angPas.tambah(m);
        }
        System.out.println("Data Anggota Paskibraka DESC Bedasarkan Tinggi = ");
        angPas.sorting();
        angPas.tampil();
        System.out.println("Anggota Paskibraka yang Lolos");
        angPas.cekTinggi();
    }
}
