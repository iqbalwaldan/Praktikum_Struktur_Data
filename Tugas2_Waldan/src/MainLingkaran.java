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
public class MainLingkaran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari jari = ");
        double r = sc.nextDouble();
        Lingkaran ling = new Lingkaran(r);
        ling.tampil();
    }
}
