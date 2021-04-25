/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package No1;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String Q = sc.nextLine();
        int total = Q.length();
        Stack st = new Stack(total);
        st.membalikkan(Q);
        st.print();
    }
}
