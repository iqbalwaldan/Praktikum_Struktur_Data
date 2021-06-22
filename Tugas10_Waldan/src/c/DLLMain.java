/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class DLLMain {

    public static void menu() {

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        boolean ulang;
        do {
            System.out.println("DAFTAR NILAI MAHASISWA");
            System.out.println("=====================================");
            System.out.println("Memilih Menu");
            System.out.println("1. Tambah head");
            System.out.println("2. Tambah tail");
            System.out.println("3. Tambah Data");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari");
            System.out.println("9. Sorting IPK DESC");
            System.out.println("10. Keluar");
            System.out.print("--> Masukkan Pilihan (1/2/3/4)! ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            String nim, nama;
            Double nil;
            int index;
            switch (pilihan) {
                case 1:
                    System.out.println("--ADD FIRST--");
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    nil = sc.nextDouble();
                    sc.nextLine();
                    dll.addFirst(nim, nama, nil);
                    break;
                case 2:
                    System.out.println("--ADD LAST--");
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    nil = sc.nextDouble();
                    sc.nextLine();
                    dll.addLast(nim, nama, nil);
                    break;
                case 3:
                    System.out.println("--ADD--");
                    System.out.print("Masukkan index: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan NIM : ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan IPK : ");
                    nil = sc.nextDouble();
                    sc.nextLine();
                    dll.add(nim, nama, nil, index);
                    break;
                case 4:
                    System.out.println("--REMOVE FIRST--");
                    dll.removeFirst();
                    break;
                case 5:
                    System.out.println("--REMOVE LAST--");
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("--REMOVE--");
                    System.out.print("Masukkan index: ");
                    index = sc.nextInt();
                    dll.remove(index);
                    break;
                case 7:
                    System.out.println("--CETAK--");
                    dll.print();
                    break;
                case 8:
                    System.out.println("--SEARCH--");
                    System.out.print("Masukkan data: ");
                    nim = sc.nextLine();
                    dll.cari(nim);
                    break;
                case 9:
                    System.out.println("--URUT IPK DESC--");
                    dll.sort();
                    break;
                case 10:
                    ulang = false;
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
