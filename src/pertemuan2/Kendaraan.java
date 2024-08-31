/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author HP
 */
public class Kendaraan {
   private String tipe;
   private int jumlahRoda;

    public Kendaraan() {
        System.out.println("Halo dari konstruktor Kendaraan");
        this.setTipe("Umum");
        this.setJumlahRoda(4);
    }
    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    /**
     * @return the jumlahRoda
     */
    public int getJumlahRoda() {
        return jumlahRoda;
    }

    /**
     * @param jumlahRoda the jumlahRoda to set
     */
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
   
  
    
}
