/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepatu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Sepatu> daftarSepatu = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("      SISTEM MANAJEMEN TOKO SEPATU");
            System.out.println("========================================");
            System.out.println("1. Tambah Sepatu Running");
            System.out.println("2. Tambah Sepatu Lifestyle");
            System.out.println("3. Tampilkan Semua Sepatu");
            System.out.println("4. Ubah Data Sepatu");
            System.out.println("5. Hapus Data Sepatu");
            System.out.println("6. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahRunning();
                    break;

                case 2:
                    tambahLifeStyle();
                    break;

                case 3:
                    tampilkanSepatu();
                    break;

                case 4:
                    ubahSepatu();
                    break;

                case 5:
                    hapusSepatu();
                    break;

                case 6:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid!");
            }

        } while (pilihan != 6);

        input.close();
    }

    // =====================================================
    // CREATE - TAMBAH SEPATU RUNNING
    // =====================================================

    public static void tambahRunning() {

        System.out.println("\n--- PILIH SEPATU RUNNING ---");
        System.out.println("1. Adidas Adios Pro 4 - Rp3.400.000");
        System.out.println("2. ASICS Metaspeed Sky/Edge - Rp3.500.000");
        System.out.println("3. Nike Alphafly 4 - Rp4.800.000");
        System.out.println("4. New Balance FuelCell Rebel v5 - Rp2.000.000");
        System.out.println("5. On Cloudboom Strike 2 - Rp5.500.000");
        System.out.println("6. Saucony Endorphin Speed 5 - Rp2.500.000");

        System.out.print("Pilih model: ");
        int pilihan = input.nextInt();

        String merek = "";
        String nama = "";
        double harga = 0;

        switch (pilihan) {

            case 1:
                merek = "Adidas";
                nama = "Adios Pro 4";
                harga = 3400000;
                break;

            case 2:
                merek = "ASICS";
                nama = "Metaspeed Sky/Edge";
                harga = 3500000;
                break;

            case 3:
                merek = "Nike";
                nama = "Alphafly 4";
                harga = 4800000;
                break;

            case 4:
                merek = "New Balance";
                nama = "FuelCell Rebel v5";
                harga = 2000000;
                break;

            case 5:
                merek = "On";
                nama = "Cloudboom Strike 2";
                harga = 5500000;
                break;

            case 6:
                merek = "Saucony";
                nama = "Endorphin Speed 5";
                harga = 2500000;
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Ukuran sepatu: ");
        int ukuran = input.nextInt();
        input.nextLine();

        System.out.print("Jenis lari: ");
        String jenisLari = input.nextLine();

        SepatuRunning sepatu = new SepatuRunning(
                merek,
                nama,
                ukuran,
                harga,
                jenisLari
        );

        daftarSepatu.add(sepatu);

        System.out.println("Sepatu running berhasil ditambahkan!");
    }

    // =====================================================
    // CREATE - TAMBAH SEPATU LIFESTYLE
    // =====================================================

    public static void tambahLifeStyle() {

        System.out.println("\n--- PILIH SEPATU LIFESTYLE ---");
        System.out.println("1. Adidas Samba - Rp1.800.000");
        System.out.println("2. Nike Air Force 1 - Rp1.700.000");
        System.out.println("3. New Balance 990 - Rp3.500.000");
        System.out.println("4. On Cloud 6 - Rp2.600.000");
        System.out.println("5. ASICS GEL-KAYANO 14 - Rp2.400.000");
        System.out.println("6. Saucony ProGrid Omni 9 - Rp2.750.000");

        System.out.print("Pilih model: ");
        int pilihan = input.nextInt();

        String merek = "";
        String nama = "";
        double harga = 0;

        switch (pilihan) {

            case 1:
                merek = "Adidas";
                nama = "Samba";
                harga = 1800000;
                break;

            case 2:
                merek = "Nike";
                nama = "Air Force 1";
                harga = 1700000;
                break;

            case 3:
                merek = "New Balance";
                nama = "990";
                harga = 3500000;
                break;

            case 4:
                merek = "On";
                nama = "Cloud 6";
                harga = 2600000;
                break;

            case 5:
                merek = "ASICS";
                nama = "GEL-KAYANO 14";
                harga = 2400000;
                break;

            case 6:
                merek = "Saucony";
                nama = "ProGrid Omni 9";
                harga = 2750000;
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Ukuran sepatu: ");
        int ukuran = input.nextInt();
        input.nextLine();

        System.out.print("Gaya sepatu: ");
        String gaya = input.nextLine();

        SepatuLifeStyle sepatu = new SepatuLifeStyle(
                merek,
                nama,
                ukuran,
                harga,
                gaya
        );

        daftarSepatu.add(sepatu);

        System.out.println("Sepatu lifestyle berhasil ditambahkan!");
    }

    // =====================================================
    // READ - MENAMPILKAN SEMUA SEPATU
    // =====================================================

    public static void tampilkanSepatu() {

        System.out.println("\n--- DAFTAR SEMUA SEPATU ---");

        if (daftarSepatu.isEmpty()) {
            System.out.println("Belum ada data sepatu.");
            return;
        }

        for (int i = 0; i < daftarSepatu.size(); i++) {

            System.out.println("\nNomor Data: " + (i + 1));

            daftarSepatu.get(i).tampilkanInfo();

            System.out.println("----------------------------------------");
        }
    }

    // =====================================================
    // UPDATE - MENGUBAH DATA SEPATU
    // =====================================================

    public static void ubahSepatu() {

        tampilkanSepatu();

        if (daftarSepatu.isEmpty()) {
            return;
        }

        System.out.print("Pilih nomor sepatu yang ingin diubah: ");
        int nomor = input.nextInt();

        if (nomor < 1 || nomor > daftarSepatu.size()) {
            System.out.println("Nomor sepatu tidak valid!");
            return;
        }

        Sepatu sepatu = daftarSepatu.get(nomor - 1);

        System.out.print("Masukkan ukuran baru: ");
        int ukuranBaru = input.nextInt();

        sepatu.setUkuran(ukuranBaru);

        System.out.println("Ukuran sepatu berhasil diubah!");
    }

    // =====================================================
    // DELETE - MENGHAPUS DATA SEPATU
    // =====================================================

    public static void hapusSepatu() {

        tampilkanSepatu();

        if (daftarSepatu.isEmpty()) {
            return;
        }

        System.out.print("Pilih nomor sepatu yang ingin dihapus: ");
        int nomor = input.nextInt();

        if (nomor < 1 || nomor > daftarSepatu.size()) {
            System.out.println("Nomor sepatu tidak valid!");
            return;
        }

        daftarSepatu.remove(nomor - 1);

        System.out.println("Data sepatu berhasil dihapus!");
    }
}