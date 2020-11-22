/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahkurang;

/**
 *
 * @author Fahrih Fatahilah  
 */
public class TambahKurang {

    /**
 *Nama  : Fahrih Fatahilah 
 *Kelas : PBO2
 *NIM   : 10116405
 *Deskripsi Program : program ini berisi program hasil penjumlahan dan selisih
     * @param args
 */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan jumlahBil = new JumlahBilangan();
        SelisihBilangan selisihBil = new SelisihBilangan();

        jumlahBil.tampilHasilJumlah();
        selisihBil.tampilHasilSelisih();
    }

}
