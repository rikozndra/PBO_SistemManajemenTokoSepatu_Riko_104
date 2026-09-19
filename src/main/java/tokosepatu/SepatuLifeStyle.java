/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepatu;

/**
 *
 * @author user
 */
public class SepatuLifeStyle extends Sepatu {
    
    private String gaya;

    // Constructor
    public SepatuLifeStyle(String merek, String nama, int ukuran,
            double harga, String gaya) {

        super(merek, nama, ukuran, harga);

        this.gaya = gaya;
    }

    // Getter
    public String getGaya() {
        return gaya;
    }

    // Setter
    public void setGaya(String gaya) {
        this.gaya = gaya;
    }

    // Override method
    @Override
    public void tampilkanInfo() {

        System.out.println("Kategori   : Lifestyle");
        System.out.println("Merek      : " + getMerek());
        System.out.println("Nama       : " + getNama());
        System.out.println("Ukuran     : " + getUkuran());
        System.out.println("Harga      : Rp" + getHarga());
        System.out.println("Gaya       : " + gaya);
    }
}
