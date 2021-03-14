/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class KelompokMahasiswa {

    public String[][] arr;

    public KelompokMahasiswa(String arrKelompok[][]) {
        arr = new String[arrKelompok.length][arrKelompok[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arrKelompok[i][j];
            }
        }
    }

    public void menampilkanArray() {
        System.out.println("Daftar Kelompok Mahasiswa");
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Kelompok " + x + " :");
            x++;
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println("");
        }
    }

    public void mencariNamaMahasiswa(String key) {
        int index1 = -1, index2 = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                String data = arr[i][j];
                if (data.equalsIgnoreCase(key)) {
                    index1 = i + 1;
                    index2 = j + 1;
                    break;
                }
            }
        }
        if (index1 == -1 || index2 == -1) {
            System.out.println("Mahasiswa bernama " + key + " tidak terdaftar dalam kelompok");
        } else {
            System.out.println("Mahasiswa bernama " + key + " berada pada Kelompok ke-" + index1 + " dan urutan ke-" + index2 + " dalam kelompok");
        }
    }
}
