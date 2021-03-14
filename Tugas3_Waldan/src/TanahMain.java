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
public class TanahMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Tanah : ");
        int n = sc.nextInt();
        Tanah tn = new Tanah();
        Tanah[] tArray = new Tanah[n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Tanah " + x);
            x++;
            System.out.print("Panjang : ");
            int p = sc.nextInt();
            System.out.print("Lebar : ");
            int l = sc.nextInt();
            tArray[i] = new Tanah(p, l);
        }
        x = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Luas Tanah " + x + " = " + tn.menghitungLuas(tArray[i].panjang, tArray[i].lebar));
            x++;
        }
        // modifikasi soal no 2
        tn.mengurutkanLuasTanah(tArray);
    }
}
