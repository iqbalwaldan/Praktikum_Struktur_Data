/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Nomor2 {

    public static void main(String[] args) {
        float saldo = 1_000_000;
        int n = 1;
        while (true) {
            saldo += saldo * 0.02F;
            if (saldo >= 1_500_000) {
                break;
            }
            n++;
        }
        System.out.println("Untuk mencapai 1,5 juta maka harus manabung selama "+n+" bulan");
        System.out.println("Dengan total tabungan = Rp. "+saldo);
    }
}
