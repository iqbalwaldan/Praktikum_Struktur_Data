/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(20);
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
                        System.out.print("No Trasaksi: ");
                        String no = sc.nextLine();
                        System.out.print("Tanggal Transaksi (DD/MM/YYYY): ");
                        String thn = sc.nextLine();
                        System.out.print("Jumlah Barang: ");
                        int jmlBr = sc.nextInt();
                        System.out.print("Jumlah Total Bayar: ");
                        int jmlTB = sc.nextInt();
                        Struk struk = new Struk(no, thn, jmlBr, jmlTB);
                        System.out.print("Apakah Anda akan menambahkan struk baru kedalam laci (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        st.push(struk);
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
