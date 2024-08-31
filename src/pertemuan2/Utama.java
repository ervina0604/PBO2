/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author HP
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Membuat objek Kendaraan
        Kendaraan kendaraanUmum = new Kendaraan();
        System.out.println("Informasi Kendaraan:");
        System.out.println("Tipe: " + kendaraanUmum.getTipe());
        System.out.println("Jumlah Roda: " + kendaraanUmum.getJumlahRoda());
        System.out.println("");

        // Membuat objek Mobil
        Mobil mobilSederhana = new Mobil();
        System.out.println("Informasi Mobil:");
        System.out.println("Tipe: " + mobilSederhana.getTipe());
        System.out.println("Jumlah Roda: " + mobilSederhana.getJumlahRoda());
        System.out.println("");

        // Membuat objek Taxi
        Taxi taxiKuning = new Taxi();
        System.out.println("Informasi Taxi:");
        System.out.println("Tipe: " + taxiKuning.getTipe());
        System.out.println("Jenis Mesin: " + taxiKuning.getJenisMesin());
        System.out.println("");

        // Casting dari Taxi ke Mobil
        Mobil taxiKeMobil = (Mobil) taxiKuning;
        taxiKeMobil.setJenisMesin("Diesel");
        taxiKeMobil.setKapasitasMesin(200);
        System.out.println("Casting dari Taxi ke Mobil:");
        System.out.println("Jenis Mesin: " + taxiKeMobil.getJenisMesin());
        System.out.println("Kapasitas Mesin: " + taxiKeMobil.getKapasitasMesin());
        System.out.println("");

        //INTERFACE
        Pengemudi vehicle = new Pengemudi("Ali");
        vehicle.mengemudi();
        vehicle.membersihkan();
        vehicle.mengelola();

    }

}
