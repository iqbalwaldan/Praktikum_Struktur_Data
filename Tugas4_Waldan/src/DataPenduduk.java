/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class DataPenduduk {

    public String nik, nama, alamat, jenisKelamin;
    public String[][] arr;
    public int[] no;

    public DataPenduduk(String arrPenduduk[][], int arrUrut[]) {
        arr = new String[arrPenduduk.length][arrPenduduk[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arrPenduduk[i][j];
            }
        }
        no = new int[arrUrut.length];
        for (int i = 0; i < arr.length; i++) {
            no[i] = arrUrut[i];
        }
    }

    public void menampilkanArray() {
        System.out.println("--- DATA PENDUDUK ---");
        System.out.println("NO\tNIK\tNAMA\tALAMAT\t\tJENIS KELAMIN");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(no[i]);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println("");
        }
    }

    public void mencariData(String key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            String data = arr[i][0];
            if (data.equalsIgnoreCase(key)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Penduduk dengan NIK : " + key + " tidak terdaftar");
        } else {
            System.out.print(no[index]);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t" + arr[index][j]);
            }
            System.out.println();
        }
    }
}
