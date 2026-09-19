/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepatu;

/**
 *
 * @author user
 */
public class Sepatu {
    
    // Atribut
    private String merek;
    private String nama;
    private int ukuran;
    private double harga;

    // Constructor
    public Sepatu(String merek, String nama, int ukuran, double harga) {
        this.merek = merek;
        this.nama = nama;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    // Getter
    public String getMerek() {
        return merek;
    }

    public String getNama() {
        return nama;
    }

    public int getUkuran() {
        return ukuran;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Merek    : " + merek);
        System.out.println("Nama     : " + nama);
        System.out.println("Ukuran   : " + ukuran);
        System.out.println("Harga    : Rp" + harga);
    }
}
