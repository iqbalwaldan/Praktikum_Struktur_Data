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
public class DLLProduk {

    Produk head;
    int size;

    public DLLProduk() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirstProduk(String kode, String jenis, String provider, int nominal) {
        if (isEmpty()) {
            head = new Produk(null, kode, jenis, provider, nominal, null);
        }
        size++;
    }

    public void addLastProduk(String kode, String jenis, String provider, int nominal) {
        if (isEmpty()) {
            addFirstProduk(kode, jenis, provider, nominal);
        } else {
            Produk current = head;
            while (current.next != null) {
                current = current.next;
            }
            Produk newBarang = new Produk(current, kode, jenis, provider, nominal, null);
            current.next = newBarang;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printProduk() {
        if (!isEmpty()) {
            Produk tmp = head;
            System.out.println("Kode Produk\t Jenis \t\t Provider \t\t Nominal");
            while (tmp != null) {
                System.out.print(tmp.kode + "\t\t ");
                System.out.print(tmp.jenis + "\t\t ");
                System.out.print(tmp.provider + "\t\t ");
                System.out.print(tmp.nominal + "\t\t ");
                System.out.println("");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Data Barang Masih Kosong");
        }
    }

    public int cariHargaProduk(String cari, int nominal) throws Exception {
        int harga = 0;
        if (isEmpty()) {
            throw new Exception("Data Barang Masih Kosong");
        }
        Produk tmp = head;
        while (!tmp.kode.equalsIgnoreCase(cari)) {
            tmp = tmp.next;
            if (tmp.next == null) {
                break;
            }
        }
        if (tmp.kode.equalsIgnoreCase(cari) && tmp.nominal == nominal) {

            System.out.println("Produk Yang Anda Beli Tersedia");
            harga = tmp.nominal;

        } else {
            System.out.println("Produk Yang Anda Beli Tidak Tersedia");
        }
        return harga;
    }
}
