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
 * Deskripsi Program : berisi class dari Bola
 */
public class Bola extends BangunRuang {
    public Bola(double r){
        super(r);
    }

        
    @Override
    public double hitungVolume(){
        return(4 * Math.PI * Math.pow(super.getR(),3))/3;
    }
    
    @Override
    public void tampilVolume(){
        System.out.println("Bangun Ruang Bola");
        super.tampilVolume();
    }
}
