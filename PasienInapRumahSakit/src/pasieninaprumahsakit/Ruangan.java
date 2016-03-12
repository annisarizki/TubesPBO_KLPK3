/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;

/**
 *
 * @author AngkyMusa
 */
public class Ruangan {
    private PasienInap[100] daftarPasien ;
    private String noRuang;
    private int nPasien=1;
    
    public tambahPasienInap(PasienInap P, String noRuang){
        if(nPasien<=daftarPasien.length) {
            daftarPasien[nPasien]=P;
            this.noRuang=noRuang;
            nPasien++;
        }
        else {
            System.out.println("Ruangan penuh");
        }
    }

    public String getNoRuang() {
        return noRuang;
    }

    public void setNoRuang(String noRuang) {
        this.noRuang = noRuang;
    }

    public int getnPasien() {
        return nPasien;
    }

    public void setnPasien(int nPasien) {
        this.nPasien = nPasien;
    }
    public getKapasitas(){
        return daftarPasien.length-nPasien;
    }
    
}
