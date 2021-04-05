/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class nau {

    public static void main(String[] args) {
        float harga = 50_000_000;
        float gaji = 5_000_000;
        float invest = 10 / 100F;
        float tabung = 10 / 100F;
        float t = 0;
        float xx = 0;
        float x = 1;
        float ti = 0;
        float tt = 0;
        float rt = 0;
        int o = 13;
        while (true) {
            if (x <= 12) {
                ti = gaji * invest;
                xx += ti;
                tt = gaji * tabung;
                rt = ti * 5 / 100F;
                t = ti + tt + rt;
            } else if (x <= 24) {
                if (x == o) {
                    xx += xx * 5 / 100F;
                    gaji += 5_000_000 * (10 / 100F);
                }
                xx += ti;
                ti = gaji * invest;
                tt = gaji * tabung;
                rt = ti * 5 / 100F;
                t = ti + tt + rt;
            } else if (x <= 36) {
                o += 12;
                if (x == 25) {
                    xx += xx * 5 / 100F;
                    gaji += 5_000_000 * (15 / 100F);
                }
                xx += ti;
                ti = gaji * invest;
                tt = gaji * tabung;
                rt = ti * 5 / 100F;
                t = ti + tt + rt;
            }
            if(xx >= harga){
                System.out.println(xx);
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
