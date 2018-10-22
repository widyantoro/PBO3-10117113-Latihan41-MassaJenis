/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb03.pkg10117113.latihan41.massajenis;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk mencari nilai masa jenis sebuah kubus
 *            
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int HitungVolume (int parSisi){
        return sisi*sisi*sisi;
    }
    
    public int MassaJenis (int parMassa, int volume){
        return  massa/volume ;
    } 
}
