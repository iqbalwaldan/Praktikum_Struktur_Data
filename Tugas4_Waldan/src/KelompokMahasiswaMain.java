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
public class KelompokMahasiswaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] kelompok = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}};
        KelompokMahasiswa km = new KelompokMahasiswa(kelompok);
        km.menampilkanArray();
        System.out.println("Masukkan nama mahasiswa yang dicari");
        String cari = sc.nextLine();
        km.mencariNamaMahasiswa(cari);
    }
}
