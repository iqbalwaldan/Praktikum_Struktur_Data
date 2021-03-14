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
public class Nomor4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1. Luas Segitiga\n"
                + "2. Luas Persegi Panjang\n"
                + "3. Luas Lingkaran\n"
                + "Masukkan Pilihan (1/2/3): ");
        int pil=sc.nextInt();
        switch(pil){
            case 1:
                System.out.println("Luas Segitiga = "+luasSegitiga());
                break;
            case 2:
                System.out.println("Luas Persegi Panjang = "+luasPersegiPanjang());
                break;
            case 3:
                System.out.println("Luas Lingkaran = "+luasLingkaran());
                break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah!");
        }
    }
    static float luasSegitiga(){
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Tinggi: ");
        float t = sc.nextFloat();
        System.out.print("Alas: ");
        float a = sc.nextFloat();
        float luas = t * a / 2;
        return luas;
    }
    static float luasPersegiPanjang(){
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Tinggi: ");
        float t = sc.nextFloat();
        System.out.print("Lebar: ");
        float l = sc.nextFloat();
        float luas = t * l;
        return luas;
    }
    static float luasLingkaran(){
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Jari - Jari: ");
        float r = sc.nextFloat();
        float luas = r * r * 3.14F;
        return luas;
    }
}
