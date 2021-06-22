/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author iqbal
 */
public class Node {
    String nim, nama;
    Double nil;
    Node prev, next;

    Node(Node prev, String nim, String nama, Double nil, Node next){
    this.prev = prev;
    this.nim = nim;
    this.nama = nama;
    this.nil = nil;
    this.next = next;
    }
}
