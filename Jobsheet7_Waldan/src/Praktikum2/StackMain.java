/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(8);
        boolean ulang;
        do {
            System.out.println("===> Menu Program <===");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("--> Masukkan Pilihan (1/2/3/4)! ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    char pilih;
                    do {
                        System.out.print("Judul: ");
                        String judul = sc.nextLine();
                        System.out.print("Nama Pengarang: ");
                        String nama = sc.nextLine();
                        System.out.print("Tahun Terbit: ");
                        int tahun = sc.nextInt();
                        System.out.print("Jumlah Halaman: ");
                        int jml = sc.nextInt();
                        System.out.print("Harga: ");
                        int hrg = sc.nextInt();
                        Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                        System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        st.push(bk);
                    } while (pilih == 'y');
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
                default:
                    System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia!");
            }
            System.out.print("\nApakah Ingin Mengulang (y/n)? ");
            char pil = sc.next().charAt(0);
            sc.nextLine();
            switch (pil) {
                case 'y':
                    ulang = true;
                    break;
                case 'n':
                    ulang = false;
                    System.out.println("Terimakasi");
                    break;
                default:
                    ulang = false;
                    System.out.println("Terimakasi");
            }
        } while (ulang);
    }
}
