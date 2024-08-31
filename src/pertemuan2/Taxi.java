/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author HP
 */
public class Taxi extends Mobil {
    private String nomorTaksi;
    private String warnaTaksi;

    public Taxi() {
        System.out.println("Halo dari Konstruktor Taksi");
        this.nomorTaksi = "T-123";
        this.warnaTaksi = "Kuning";
        super.setTipe("Taxi");
        super.setJenisMesin("Bensin");
    }
    /**
     * @return the nomorTaksi
     */
    public String getNomorTaksi() {
        return nomorTaksi;
    }

    /**
     * @param nomorTaksi the nomorTaksi to set
     */
    public void setNomorTaksi(String nomorTaksi) {
        this.nomorTaksi = nomorTaksi;
    }

    /**
     * @return the warnaTaksi
     */
    public String getWarnaTaksi() {
        return warnaTaksi;
    }

    /**
     * @param warnaTaksi the warnaTaksi to set
     */
    public void setWarnaTaksi(String warnaTaksi) {
        this.warnaTaksi = warnaTaksi;
    }
}
