/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuaan2;

/**
 *
 * @author gagayogaa
 */
public class Siswa {
    private String nama;
    private String alamat;
    private int kelas;
    
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String setalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
     public int getkelas(){
        return kelas;
    }
    public void setkelas(int kelas){
        this.kelas=kelas;
    }
    public void cetak(){
        System.out.println("Nama = "+ nama);
        System.out.println("Alamat = "+ alamat);
        System.out.println("Kelas = "+kelas);
    }
    
    public static void main(String[]args){
       Siswa kb= new Siswa();
       kb.setnama("Cristiano");
       kb.setalamat("Lisbon Portugal");
       kb.setkelas(12);
       kb.cetak();
    }
}
