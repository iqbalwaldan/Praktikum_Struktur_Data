/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSortTest;

/**
 *
 * @author iqbal
 */
public class Insertion {

    public int[] data;
    public int jumData;

    public Insertion(int Data[], int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println("");
    }

    void insertion() {
        for (int i = 1; i <= data.length - 1; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }
}
