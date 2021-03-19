/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class SortMain {

    public static void main(String[] args) {
        int a[] = {15, 10, 7, 22, 5};
        Sort urut = new Sort(a, a.length);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        urut.bubbleSort();
        System.out.println("Data sesudah urut Bubble sort (ASC)");
        urut.tampilData();
        urut.selectoinSort();
        System.out.println("Data sesudah urut Selection sort (ASC)");
        urut.tampilData();
        urut.bubbleSortDesc();
        System.out.println("Data sesudah urut Bubble sort (DESC)");
        urut.tampilData();
        urut.selectoinSortDesc();
        System.out.println("Data sesudah urut Selection sort (DESC)");
        urut.tampilData();
    }
}
