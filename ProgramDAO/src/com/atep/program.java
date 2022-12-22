 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atep;
//import java.util.List;

import java.util.List;



public class program {
    
 public static void main(String[] args) {
     
//Insert
fasilitas perintah = new fasilitas();
barang atk = new barang();
atk.setKode_barang("P002");
atk.setNama_barang("Spidol");
atk.setJumlah(50);
atk.setHarga(1500);
perintah.insert(atk);

     
     
 //Update    
 //fasilitas perintah = new fasilitas();
 //barang atk = new barang();
 //atk.setKode_barang("B0061");
 //atk.setNama_barang("BUKU GAMBAR");
 //atk.setJumlah(12);
 //atk.setHarga(3000);
 //perintah.update(atk);
 
 //Delete
 //fasilitas perintah = new fasilitas();
 //perintah.delete("B001");
 
 
 //ALL
 //fasilitas perintah = new fasilitas();
 //List <barang> list = perintah.selectAll();
 //for(barang barang : list){
 //System.out.println(barang.getKode_barang());
 //System.out.println(barang.getNama_barang());
 //System.out.println(barang.getJumlah());
 //System.out.println(barang.getHarga());
 //System.out.println("-------------------------");
 //}
}
}


