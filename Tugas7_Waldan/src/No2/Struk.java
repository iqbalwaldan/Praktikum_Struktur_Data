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
public class Struk {
    String noTansaksi, tanggal;
    int jmlBarang,totalHarga;
    
    public Struk (String no, String tgl, int jml, int tHarga){
        noTansaksi = no;
        tanggal = tgl;
        jmlBarang = jml;
        totalHarga = tHarga;
    }
}
