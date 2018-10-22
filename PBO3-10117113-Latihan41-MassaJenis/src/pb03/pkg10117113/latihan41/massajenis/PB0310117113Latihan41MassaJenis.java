/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb03.pkg10117113.latihan41.massajenis;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk mencari nilai masa jenis sebuah kubus
 *            
 */
public class PB0310117113Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kubus kbs = new Kubus();
        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("======Masa Jenis Kubus======");
        System.out.println("Sisi  : " +kbs.getSisi());
        System.out.println("Massa : " +kbs.getMassa());
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume      : " +kbs.HitungVolume(0));
        System.out.println("Massa Jenis : " +kbs.MassaJenis(kbs.getMassa(), 
                            kbs.HitungVolume(0)));
    }
    
}
