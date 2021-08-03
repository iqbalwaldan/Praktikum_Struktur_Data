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
public class Percobaan3 {
    
    static double hitungBunga(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungBunga(saldo, tahun - 1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah Saldo awal: ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya Menabung: ");
        tahun = sc.nextInt();
        System.out.print("Jumlah Uang setelah " + tahun + " tahun: ");
        System.out.println(hitungBunga(saldoAwal, tahun));
    }
}
