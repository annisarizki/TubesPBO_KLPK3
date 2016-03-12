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
    private PasienInap[] daftarPasien ;
    private String noRuang;
    private int nPasien;
    private int nKapasitas;
    public Ruangan(String noRuang, int n){
        this.noRuang=noRuang ;
        this.nKapasitas=n;
        daftarPasien=new PasienInap[nKapasitas];
    }
    public void tambahPasienInap(PasienInap P, Dokter d){
        if(nPasien<=daftarPasien.length) {
            daftarPasien[nPasien]=P;
            daftarPasien[nPasien].setDokter(d);
            nPasien++;
        }
        else {
            System.out.println("Ruangan penuh");
        }
    }

    public String getNoRuang() {
        return this.noRuang;
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
    public int getKapasitas(){
        return daftarPasien.length-nPasien;
    }
    
}
