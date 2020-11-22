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
class SelisihBilangan extends Bilangan{
    public void tampilHasilSelisih() {
        int z = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() 
                + " = " + z);
    }
    
}
