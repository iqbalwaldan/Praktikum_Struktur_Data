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
public class BankMain {

    public static void hari() {
        System.out.println("Kode Hari");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumad");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Kode Hari: ");
    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Menambah Data Antrian Customer");
        System.out.println("2. Customer Selesai Dilayani");
        System.out.println("3. Antrian Custumer Terdepan");
        System.out.println("4. Menampilkan Antrian Custumer");
        System.out.println("5. Jumlah Antrian Custemer");
        System.out.println("6. Bank Sudah Tutup");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        hari();
        pilih = sc.nextInt();
        sc.nextLine();
        int teller = 0;
        switch (pilih) {
            case 1:
            case 2:
            case 3:
                teller = 5;
                break;
            case 4:
            case 5:
                teller = 3;
                break;
            default:
                teller = 0;
                System.out.println("Bank Tutup");
                System.exit(0);
                break;
        }
        System.out.println("");
        Queue antri = new Queue(15);
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Menasukkan Data Customer");
                    System.out.print("No Rekening: ");
                    String noReg = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    Customer p = new Customer(noReg, nama);
                    antri.Enqueue(p);
                    System.out.println("Cuatomer Berhasil ditambahkan pada antrian ke-"+antri.size);
                    System.out.println("");
                    break;
                case 2:
                    antri.Dequeue(teller);
                    System.out.println("");
                    break;
                case 3:
                    antri.peek();
                    System.out.println("");
                    break;
                case 4:
                    antri.print();
                    System.out.println("");
                    break;
                case 5:
                    antri.jumalahAntrian();
                    System.out.println("");
                    break;
                default:
                    System.out.println("Bank Sudah Tutup");
                    System.exit(0);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
