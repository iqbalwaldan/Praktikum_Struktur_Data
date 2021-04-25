/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author iqbal
 */
public class ShellMain {
    public static void main(String[] args) {
        Shell urut = new Shell(4);
        Barang b = new Barang("Pensil", 35, 1000);
        urut.masukkanData(b,0);
        b = new Barang("Buku", 20, 5000);
        urut.masukkanData(b,1);
        b = new Barang("Penggaris", 50, 1500);
        urut.masukkanData(b,2);
        b = new Barang("Bulpen", 25, 2000);
        urut.masukkanData(b,3);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        urut.shellSort();
        System.out.println("Data sesudah urut (DESC)");
        urut.tampilData();
    }
}
