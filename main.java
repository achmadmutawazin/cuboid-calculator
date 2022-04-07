/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid.calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import cuboid.calculator.*;
/**
 *
 * @author achmadmutawazin
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            GUI gui = new GUI ();
            gui.count.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                try{
                String llength = gui.getflength();
                String lwidth = gui.getfwidth();
                String lheight = gui.getfheight();
                double length = Double.valueOf(llength);
                double width = Double.valueOf(lwidth);
                double height = Double.valueOf(lheight);
                PersegiPanjang hasil = new PersegiPanjang(length, width);
                hasil.Luas();
                hasil.Keliling();
                gui.rarea.setText("Square Area   : " + hasil.getLuas());
                gui.rcircumference.setText("Square Circumference   : " + hasil.getKeliling());
                Balok hasil2 = new Balok(length, width, height);
                hasil2.Volume();
                hasil2.LuasPermukaan();
                gui.rvolume.setText("Cuboid Volume   : " + hasil2.getVolume());
                gui.rsarea.setText("Cuboid Surface Area   : " + hasil2.getLuaspermukaan());
                }catch(Exception exc){
                JOptionPane.showMessageDialog(null, exc.getMessage() + "wrong input !");
                }}
            });
            gui.reset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                gui.clearFields();
                }
            });
    }
    
}
