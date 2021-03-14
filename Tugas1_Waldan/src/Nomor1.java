/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Nomor1 {

    public static void main(String[] args) {
        int[] berat = {4, 15, 6, 11};
        float total = 0;
        for (int i = 0; i < berat.length; i++) {
            if (berat[i] > 10) {
                total += (berat[i] * 4500) - (berat[i] * 4500 * 0.05F);
            } else {
                total += (berat[i] * 4500);
            }
        }
        System.out.println("Total Pendapatan Smile Laundry = Rp. "+total);
    }
}
