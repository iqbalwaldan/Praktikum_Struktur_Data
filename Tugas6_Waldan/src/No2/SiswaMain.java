/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author iqbal
 */
public class SiswaMain {

    public static void main(String[] args) {
        Insertion in = new Insertion(5);
        Siswa s;
        s = new Siswa("Waldan", 90, 95, 96);
        in.masukkanData(s, 0);
        s = new Siswa("Wahyu", 86, 90, 93);
        in.masukkanData(s, 1);
        s = new Siswa("Zaki", 89, 87, 82);
        in.masukkanData(s, 2);
        s = new Siswa("Afada", 91, 90, 93);
        in.masukkanData(s, 3);
        s = new Siswa("Rian", 85, 87, 90);
        in.masukkanData(s, 4);
        in.hitungTotal();
        System.out.println("Data sebelum urut");
        in.tampilData();
        in.insertion();
        System.out.println("Data sesudah urut (DESC)");
        in.tampilData();
        System.out.println("Berikut adalah 3 Siswa dengan total nilai tertinggi:");
        in.tampilSiswaTerbaik();
    }
}
