/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepatu;

/**
 *
 * @author user
 */
public class SepatuRunning extends Sepatu {
    
    private String jenisLari;

    // Constructor
    public SepatuRunning(String merek, String nama, int ukuran,
            double harga, String jenisLari) {

        super(merek, nama, ukuran, harga);

        this.jenisLari = jenisLari;
    }

    // Getter
    public String getJenisLari() {
        return jenisLari;
    }

    // Setter
    public void setJenisLari(String jenisLari) {
        this.jenisLari = jenisLari;
    }

    // Override method
    @Override
    public void tampilkanInfo() {

        System.out.println("Kategori   : Running");
        System.out.println("Merek      : " + getMerek());
        System.out.println("Nama       : " + getNama());
        System.out.println("Ukuran     : " + getUkuran());
        System.out.println("Harga      : Rp" + getHarga());
        System.out.println("Jenis Lari : " + jenisLari);
    }
}
