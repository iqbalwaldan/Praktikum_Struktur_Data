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
public class MahasiswaMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Mahasiswa");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        sc.nextLine();
        Queue antri = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nim: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa p = new Mahasiswa(nim, nama, absen, ipk);
                    antri.Enqueue(p);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Data yang dikeluarkan: " + data.nim + " " + data.nama + " "
                                + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nim mahasiswa yang ingin dicari: ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Masukkan no antrian yang ingin ditampilkan: ");
                    int index = sc.nextInt();
                    antri.peekAt(index);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
