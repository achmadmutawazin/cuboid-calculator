/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboid.calculator;

/**
 *
 * @author achmadmutawazin
 */
public class Balok implements MenghitungRuang{
double panjang, lebar, volume, luaspermukaan, tinggi;
    public Balok(double panjang,double lebar,double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void Volume(){
    volume = panjang*lebar*tinggi;}
    
    public void LuasPermukaan (){
    luaspermukaan = 2*((panjang*lebar)+(panjang*tinggi)+(lebar+tinggi));}

    public double getVolume() {
        return volume;
    }

    public double getLuaspermukaan() {
        return luaspermukaan;
    }
    

}


