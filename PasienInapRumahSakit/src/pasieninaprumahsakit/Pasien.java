/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;

/**
 *
 * @author Elsa AW
 */
public class Pasien extends Orang {
    private String idPasien;
    private String waliPasien;
    private String alamat;
	
    public Pasien(String nama, char jenisKelamin, int umur, String idPasien, String waliPasien){
        super(nama,jenisKelamin,umur);
	this.idPasien=idPasien;
	this.waliPasien=waliPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public void setWaliPasien(String waliPasien) {
        this.waliPasien = waliPasien;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getIdPasien() {
        return idPasien;
    }

    public String getWaliPasien() {
        return waliPasien;
    }

    public String getAlamat() {
        return alamat;
    }
}
