/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan52.SiapaKamu;

/**
 *
 * @author
 * NAMA              : Wahyu Muharik
 * KELAS             : FS112B
 * NIK               : 2022431637
 * Deskripsi Program : Program Untuk Menampilkan Siapa Kamu Dengan Menggunakan 
 *                     Konsep Inheritance dan Polymorphism
 */
public class Main {
    public static void main(String[]args){
        Dosen d = new Dosen();
        d.setNip("41227829930");
        System.out.println("NIP DOSEN : " + d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
