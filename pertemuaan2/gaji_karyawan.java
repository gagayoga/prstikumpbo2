/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuaan2;

import javax.swing.JOptionPane;

/**
 *
 * @author gagayoga
 */
public class gaji_karyawan {
    private int gaji_p;
    private int tunjangan;
    private int potongan;
    private int gaji_bersih;
    
    public int getgaji_p(){
        return gaji_p;
    }
    public void setgaji_p(int gaji_p){
        this.gaji_p=gaji_p;
    }
    public int gettunjangan(){
        return tunjangan;
    }
    public void settunjangan(int tunjangan){
        this.tunjangan=tunjangan;
    }
    public int getpotongan(){
        return potongan;
    }
    public void setpotongan(int potongan){
        this.potongan=potongan;
    }
    public int getgaji_bersih(){
        return gaji_bersih;
    }
    public void setgaji_bersih(int gaji_bersih){
        this.gaji_bersih=gaji_bersih;
    }
    public void cetak(){
        JOptionPane.showMessageDialog(null,"Sealamat Datang di Program Gaji Karywan","Halaman Masuk",JOptionPane.INFORMATION_MESSAGE);
        String inputgaji=JOptionPane.showInputDialog(null,"Masukan Gaji Pokok = ");
        gaji_p=Integer.parseInt(inputgaji);
        tunjangan=500000;
        potongan=100000;
        gaji_bersih= (gaji_p+tunjangan)-potongan;
        JOptionPane.showMessageDialog(null,"Gaji pokok = "+ gaji_p + "\nTunjangan  = "+tunjangan +"\nPotongan = "+potongan +"\nGaji Bersih  = "+ gaji_bersih,"Data Gaji",JOptionPane.INFORMATION_MESSAGE);   
    }
    
    public static void main(String[]args){
        gaji_karyawan a1= new gaji_karyawan();
        a1.cetak();
    }
}
