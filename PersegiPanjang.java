/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboid.calculator;

/**
 *
 * @author achmadmutawazin
 */
public class PersegiPanjang implements MenghitungBidang {
private double panjang, lebar, tinggi, luas, keliling;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void Luas(){
    luas = panjang*lebar;
    }
    
    public void Keliling(){
    keliling = (2*panjang)+(2*lebar);
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

}
    

