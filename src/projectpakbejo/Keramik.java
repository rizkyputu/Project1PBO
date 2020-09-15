/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo;

/**
 *
 * @author asus
 */
public class Keramik {
    /* membuat atribut */
    int panjang;
    int lebar;
    int harga;
    int isi;
    int luastanah;
    
    
    
    /* membuat methods */
    void hitungLuas(){
        int luas;
        luas = this.panjang * this.lebar;
        System.out.println("Luas keramik: " + luas + " cm ");
    }
    void hitungTotal (){
        int total;
        total = ((this.luastanah/(this.panjang * this.lebar)/this.isi) * this.harga);
        System.out.println("Total bayar: " + total + " ribu rupiah ");
        
    }
}
