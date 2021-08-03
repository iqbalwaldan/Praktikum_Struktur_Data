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
public class Fibonacci {

    static int hitung(int a) {
        if (a <= 0 || a <= 1) {
            return (a);
        } else {
            // rumus bilangan fibonacci ke-n adalah Fn = F(n-2) + F(n-1)
            return hitung(a - 2) + hitung(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan total bulan: ");
        int bulan = sc.nextInt();
        System.out.printf("Total pasangan marmut pada bulan ke-%d adalah %d pasangan\n",
                bulan, hitung(bulan));
    }
}
