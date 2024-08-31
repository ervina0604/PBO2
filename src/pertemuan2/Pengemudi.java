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
    public Pengemudi(String nama) {
        System.out.println("Pengemudi bernama " + nama);
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
