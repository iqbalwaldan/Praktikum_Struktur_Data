/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class BinaryTreeArray {

    int[] data;
    int idxLast;
    
    public BinaryTreeArray() {
        data = new int[10];
    }

    void populationData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void tranverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            tranverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            tranverseInOrder(2 * idxStart + 2);
        }
    }
}
