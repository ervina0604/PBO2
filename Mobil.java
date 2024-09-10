/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author HP
 */
public class Mobil extends Kendaraan {
    private String jenisMesin;
    private int kapasitasMesin;
    
    public Mobil() {
        System.out.println("Halo dari konstruktor Mobil");
        // Mengatur nilai atribut menggunakan metode setter
        this.setJenisMesin("Bensin");
        this.setKapasitasMesin(1500);
        // Memanggil setter dari superclass Kendaraan untuk mengatur nilai default
        super.setTipe("Sedan");
        super.setJumlahRoda(4);
    }
    /**
     * @return the jenisMesin
     */
    public String getJenisMesin() {
        return jenisMesin;
    }

    /**
     * @param jenisMesin the jenisMesin to set
     */
    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    /**
     * @return the kapasitasMesin
     */
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    /**
     * @param kapasitasMesin the kapasitasMesin to set
     */
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    
}
