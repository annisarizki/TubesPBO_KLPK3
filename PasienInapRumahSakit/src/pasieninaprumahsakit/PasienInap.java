/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasieninaprumahsakit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS PC
 */
public class PasienInap {
    private Pasien pasien;
	private Dokter dokter;
	private List<String> diagnose = new ArrayList<String>();
	private int nDiagnose = 0;
	
	public PasienInap(Pasien p){
		this.pasien = p;
	}
	
	public void setDokter(Dokter d){
		this.dokter = d;
	}
	
	public void setPasien(Pasien p){
		this.pasien = p;
	}
	
	public void addDiagnosa(String d){
		this.diagnose[nDiagnose] = d;
		nDiagnose++;
	}
	
	public String getDiagnose(int i){
		return diagnose[i];
	}
	
	public void deleteDiagnose(int i){
		diagnose.remove(i);
	}
}
