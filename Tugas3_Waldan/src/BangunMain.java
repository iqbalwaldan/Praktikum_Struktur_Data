
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iqbal
 */
public class BangunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kubus kb = new Kubus();
        Kubus[] arkb = new Kubus[5];
        System.out.println("===== Memasukkan Data Kubus =====");
        for (int i = 0; i < 5; i++) {
            float s = 0;
            System.out.println("Kubus ke-" + i);
            System.out.print("Masukkan Sisi: ");
            s = sc.nextFloat();
            arkb[i] = new Kubus(s);
        }
        System.out.println("***** Luas Permuakaan dan Volume Kubus *****");
        for (int i = 0; i < 5; i++) {
            System.out.println("Kubus Ke-" + i);
            kb.tampil(arkb[i].sisi);
        }

        Balok bl = new Balok();
        Balok[] arbl = new Balok[5];
        System.out.println("===== Memasukkan Data Balok =====");
        for (int i = 0; i < 5; i++) {
            float p = 0, l = 0, t = 0;
            System.out.println("Balok ke-" + i);
            System.out.print("Masukkan Panjang: ");
            p = sc.nextFloat();
            System.out.print("Masukkan Lebar: ");
            l = sc.nextFloat();
            System.out.print("Masukkan Tinggi: ");
            t = sc.nextFloat();
            arbl[i] = new Balok(p, l, t);
        }
        System.out.println("***** Luas Permuakaan dan Volume Balok *****");
        for (int i = 0; i < 5; i++) {
            System.out.println("Balok Ke-" + i);
            bl.tampil(arbl[i].panjang, arbl[i].lebar, arbl[i].tinggi);
        }

        Tabung tb = new Tabung();
        Tabung[] artb = new Tabung[5];
        System.out.println("===== Memasukkan Data Tabung =====");
        for (int i = 0; i < 5; i++) {
            float r = 0, t = 0;
            System.out.println("Balok ke-" + i);
            System.out.print("Masukkan Jari-Jari: ");
            r = sc.nextFloat();
            System.out.print("Masukkan Tinggi: ");
            t = sc.nextFloat();
            artb[i] = new Tabung(r, t);
        }
        System.out.println("***** Luas Permuakaan dan Volume Tabung *****");
        for (int i = 0; i < 5; i++) {
            System.out.println("Tabung Ke-" + i);
            tb.tampil(artb[i].tinggi, artb[i].tinggi);
        }
    }
}
