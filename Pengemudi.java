/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author HP
 */
public class Pengemudi extends Taxi implements Driver, Cleaner, Manager {
    private String nama;
    
    public Pengemudi(String nama, String NomorTaksi , String WarnaTaksi) {
        this.nama = "Andi";
        super.setNomorTaksi("T-0808");
        super.setWarnaTaksi("Hitam");
        
        System.out.println("Pengemudi bernama " + nama + " mengendarai Taxi berwarna " + getWarnaTaksi() + " dengan nomor " + getNomorTaksi());
        
    }

    public void CekPengemudi(){
        this.cekTaxi();
        super.cekTaxi();
    }
    
    public void cekTaxi() {
        System.out.println("Cek dari kelas Pengemudi");
    }
    
    @Override
    public void mengemudi() {
       System.out.println("sedang mengemudi taxi");
    }

    @Override
    public void membersihkan() {
         System.out.println("sedang membersihkan taksi");
    }

    @Override
    public void mengelola() {
        System.out.println("sedang mengelola taksi.");
    }
    
}
