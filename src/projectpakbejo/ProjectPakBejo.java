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
public class ProjectPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik ();
        k1.panjang = 30;
        k1.lebar = 30;
        k1.harga = 54000;
        k1.isi = 10;
        k1.luastanah = 1000000;
        k1.hitungLuas();
        k1.hitungTotal();
        
        Keramik k2 = new Keramik ();
       k2.panjang = 40;
       k2.lebar = 40;
       k2.harga = 65000;
       k2.isi = 5;
       k2.luastanah =1000000;
       k2.hitungLuas();
       k2.hitungTotal();
       
       Keramik k3 = new Keramik ();
       k3.panjang = 30;
       k3.lebar = 40;
       k3.harga = 60000;
       k3.isi =8;
       k3.luastanah =1000000;
       k3.hitungLuas();
       k3.hitungTotal();
    }
    
    
}
