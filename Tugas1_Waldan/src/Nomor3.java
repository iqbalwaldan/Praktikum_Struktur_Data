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
public class Nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan: ");
        int n = sc.nextInt();
        int i = 2;
        while(i < n){
            System.out.print(i+" ");
            i+=4;
        }
    }
}
