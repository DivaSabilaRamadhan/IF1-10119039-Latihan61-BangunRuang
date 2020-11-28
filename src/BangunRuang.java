/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi class dari Bangun Ruang 
 */
public abstract class BangunRuang {
    protected double r; // jari-jari
    
    public BangunRuang(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
    
    public abstract double hitungVolume();
        
    public void tampilVolume(){
        System.out.printf("Hasil : V = %.1f %n%",hitungVolume());
    }
}
