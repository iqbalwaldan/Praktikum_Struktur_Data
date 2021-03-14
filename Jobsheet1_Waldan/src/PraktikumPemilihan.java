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
public class PraktikumPemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nTugas, nUts, nUas, nAkhir;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nTugas = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        nUts = sc.nextFloat();
        System.out.print("Masukkan Nilai UAS: ");
        nUas = sc.nextFloat();
        System.out.println("==============================");
        System.out.println("==============================");
        // menghitung nilai akhir
        nAkhir = (nTugas * 0.2F) + (nUts * 0.35F) + (nUas * 0.45F);
        System.out.printf("Nilai Akhir: %.2f\n",nAkhir);
        System.out.print("Nilai Huruf: ");
        // menentukan nilai huruf
        if (nAkhir > 80 && nAkhir <= 100) {
            System.out.println("A");
            System.out.println("==============================");
            System.out.println("SELAMAT LULUS");
        } else if (nAkhir > 73 && nAkhir <= 80) {
            System.out.println("B+");
            System.out.println("==============================");
            System.out.println("SELAMAT LULUS");
        } else if (nAkhir > 65 && nAkhir <= 73) {
            System.out.println("B");
            System.out.println("==============================");
            System.out.println("SELAMAT LULUS");
        } else if (nAkhir > 60 && nAkhir <= 65) {
            System.out.println("C+");
            System.out.println("==============================");
            System.out.println("SELAMAT LULUS");
        } else if (nAkhir > 50 && nAkhir <= 60) {
            System.out.println("C");
            System.out.println("==============================");
            System.out.println("SELAMAT LULUS");
        } else if (nAkhir > 39 && nAkhir <= 50) {
            System.out.println("D");
            System.out.println("==============================");
            System.out.println("MAAF TIDAK LULUS");
        } else if (nAkhir <= 39) {
            System.out.println("E");
            System.out.println("==============================");
            System.out.println("MAAF TIDAK LULUS");
        }
    }
}
