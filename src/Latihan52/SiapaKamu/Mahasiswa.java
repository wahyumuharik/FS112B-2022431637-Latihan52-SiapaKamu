/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan52.SiapaKamu;

/**
 *
 * @author Wahyu Muharik
 */
public class Mahasiswa extends Manusia {
    private String nim, kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2");
        
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");   
    }
}
