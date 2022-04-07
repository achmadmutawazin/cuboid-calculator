/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboid.calculator;
import javax.swing.*;

/**
 *
 * @author achmadmutawazin
 */
public class GUI extends JFrame{
    JLabel title = new JLabel("Cuboid Calculator");
    JLabel rarea = new JLabel();
    JLabel rcircumference = new JLabel();
    JLabel rvolume = new JLabel();
    JLabel rsarea = new JLabel();
    JLabel result = new JLabel ("Result : ");
    JLabel llength = new JLabel("Length");
    JLabel lwidth = new JLabel("Width");
    JLabel lheight = new JLabel("Height");
    JTextField flength = new JTextField();
    JTextField fwidth = new JTextField();
    JTextField fheight = new JTextField();
    JButton count = new JButton ("Count");
    JButton reset = new JButton ("Reset");
    
    public GUI (){
    setTitle("Cuboid Calculator");
    setSize(500,500);
    setVisible(true);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    add(title);
    add(llength);
    add(lwidth);
    add(lheight);
    add(flength);
    add(fwidth);
    add(fheight);
    add(result);
    add(count);
    add(reset);
    add(rarea);
    add(rcircumference);
    add(rvolume);
    add(rsarea);
    
    title.setBounds(190,20,120,20);
    llength.setBounds(70,70,120,20);
    flength.setBounds(180,70,250,20);
    lwidth.setBounds(70,110,120,20);
    fwidth.setBounds(180,110,250,20);
    lheight.setBounds(70,150,120,20);
    fheight.setBounds(180,150,250,20);
    result.setBounds(180,180,250,20);
    count.setBounds(150,420,90,20);
    reset.setBounds(250,420,90,20);
    rarea.setBounds(70,210,200,20);
    rcircumference.setBounds(70,240,200,20);
    rvolume.setBounds(70,270,200,20);
    rsarea.setBounds(70,300,200,20);
    }
    public String getflength(){
        return flength.getText();
    }
    public String getfwidth(){
        return fwidth.getText();
    }
    public String getfheight(){
        return fheight.getText();
    }
    
    public void clearFields(){
    flength.setText(null);
    fwidth.setText(null);
    fheight.setText(null);
    rarea.setText(null);
    rcircumference.setText(null);
    rsarea.setText(null);
    rvolume.setText(null);
    }
}
