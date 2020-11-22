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
class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int z = getX() + getY();
        System.out.println("Hasil penjumlahan = " + z);
    }
}