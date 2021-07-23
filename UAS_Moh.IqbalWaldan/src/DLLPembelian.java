// 15_MOH. IQBAL WALDAN
// MI1F

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iqbal
 */
public class DLLPembelian {

    Pembelian head;
    int size;

    public DLLPembelian() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirstPembelian(int k, float h, int m) {
        if (isEmpty() && h != 0) {
            head = new Pembelian(null, k, h, m, null);
            System.out.println("Total Pembelian Barang = " + head.harga);
            size++;
        }
    }

    public void addLastPembelian(int k, int n, int m) {
        float total = hitungTotal(n, m);
        if (isEmpty()) {
            addFirstPembelian(k, total, m);
        } else if (total != 0) {
            Pembelian current = head;
            while (current.next != null) {
                current = current.next;
            }
            Pembelian newTransaksi = new Pembelian(current, k, total, m, null);
            current.next = newTransaksi;
            size++;
            System.out.println("Total Pembelian Barang = " + newTransaksi.harga);
        }
    }

    public float hitungTotal(int harga, int m) {
        float total = harga * 1000;
        if (m == 2 || m == 3 || m == 4) {
            total -= total * 0.02F;
        }
        if (m == 5) {
            total += total * 0.01F;
        }
        return total;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printPembelian() {
        float pendapatan = 0;
        if (!isEmpty()) {
            Pembelian tmp = head;
            String metode = "Tunai";
            System.out.println("Kode Pembelian\t Metode\t\t Harga\t ");
            while (tmp != null) {
                switch (tmp.metode) {
                    case 1:
                        metode = "Tunai";
                        break;
                    case 2:
                        metode = "OVO";
                        break;
                    case 3:
                        metode = "GoPay";
                        break;
                    case 4:
                        metode = "ShopeePay";
                        break;
                    case 5:
                        metode = "Debit";
                        break;
                    default:
                        break;
                }
                System.out.print(tmp.kode + "\t\t ");
                System.out.print(metode + "\t\t ");
                System.out.print(tmp.harga + "\t\t ");
                System.out.println("");
                pendapatan += tmp.harga;
                tmp = tmp.next;
            }
            System.out.println("Total Pendapatan Toko: " + pendapatan);
        } else {
            System.out.println("Data Transaksi Masih Kosong");
        }
    }

    public void mengurutkan() throws Exception {
        Pembelian current = head, index = current.next;
        int tmpK, tmpM;
        float tmpH;
        if (head == null) {
            throw new Exception("Data Transaksi Masih Kosong");
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.harga < index.harga) {
                        tmpK = current.kode;
                        tmpM = current.metode;
                        tmpH = current.harga;
                        current.kode = index.kode;
                        current.metode = index.metode;
                        current.harga = index.harga;
                        index.kode = tmpK;
                        index.metode = tmpM;
                        index.harga = tmpH;
                    }
                }
            }
            System.out.println("Sorting Berhasil Dilakukan");
        }
    }
}
