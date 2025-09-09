// Najmi Hafizh Mauludan Zain
// 2409116028
// A'24

package com.mycompany.kantorpos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    
    static ArrayList<String> resiList= new ArrayList<>();
    static ArrayList<String> pengirimList = new ArrayList<>();
    static ArrayList<String> penerimaList = new ArrayList<>();
    static ArrayList<String> nomorTeleponPenerimaList = new ArrayList<>();
    static ArrayList<String> jenisPaketList = new ArrayList<>();
    static ArrayList<String> alamatTujuanList = new ArrayList<>();
    static ArrayList<String> tanggalPengirimanList = new ArrayList<>();
    static ArrayList<String> tanggalPerkiraanSampaiList = new ArrayList<>();
    

    public static void main(String[] args){
            while (true) {
            System.out.println("\n===== Data Pengiriman Paket (Kantor Pos) =====");
            System.out.println("1. Tambah Data Paket");
            System.out.println("2. Tampilkan Data Paket");
            System.out.println("3. Update Data Paket");
            System.out.println("4. Hapus Data Paket");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilih = input.nextInt();
            input.nextLine();
            
            if (pilih == 1){
                tambahPaket();
            }else if (pilih == 2){
                tampilkanPaket();
            }else if (pilih == 3){
                updatePaket();
            }else if (pilih == 4){
                hapusPaket();
            }else if (pilih == 5){
                System.out.println("Terima Kasih sudah menggunakan program ini!");
                break;
            }else{
                System.out.println("Menu tidak valid");
            }
        }
    }
    
    public static void tambahPaket(){
        System.out.println("Masukkan Nomor Resi: ");
        String resi = input.nextLine();
        System.out.println("Masukkan Nama Pengirim: ");
        String pengirim = input.nextLine();
        System.out.println("Masukkan Nama Penerima: ");
        String penerima = input.nextLine();
        System.out.println("Masukkan Nomor Telepon Penerima: ");
        String telepon = input.nextLine();
        System.out.println("Masukkan Jenis Paket: ");
        String jenis = input.nextLine();
        System.out.println("Masukkan Alamat Tujuan: ");
        String alamat = input.nextLine();
        System.out.println("Masukkan Tanggal Pengiriman: ");
        String pengiriman = input.nextLine();
        System.out.println("Masukkan Tanggal Perkiraan Sampai: ");
        String perkiraanSampai = input.nextLine();


        resiList.add(resi);
        pengirimList.add(pengirim);
        penerimaList.add(penerima);
        nomorTeleponPenerimaList.add(telepon);
        jenisPaketList.add(jenis);
        alamatTujuanList.add(alamat);
        tanggalPengirimanList.add(pengiriman);
        tanggalPerkiraanSampaiList.add(perkiraanSampai);

        System.out.println("Paket berhasil ditambahkan!");
    }
    
    
    public static void tampilkanPaket(){
        if (resiList.isEmpty()){
            System.out.println("Belum ada data paket.");
        } else {
            System.out.println("\n=== Daftar Data Paket ===");
            for (int i = 0; i < resiList.size(); i++){
                System.out.println((i+1) + ".Resi: " + resiList.get(i));
                System.out.println(" Pengirim: " + pengirimList.get(i));                
                System.out.println(" Penerima: " + penerimaList.get(i)); 
                System.out.println(" Telepon: " + nomorTeleponPenerimaList.get(i));
                System.out.println("Jenis: " + jenisPaketList.get(i));
                System.out.println("Alamat Tujuan: " + alamatTujuanList.get(i));                  
                System.out.println("Tanggal Pengiriman: " + tanggalPengirimanList.get(i));                  
                System.out.println("Perkiraan Sampai: " + tanggalPerkiraanSampaiList.get(i)); 
                System.out.println("---------------------------");
            }
        }
    }
    
    public static void updatePaket(){
        tampilkanPaket();
        if (resiList.isEmpty()) return;
        
        System.out.println("Masukkan nomor data paket yang ingin di update: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        
        if (index >= 0 && index < resiList.size()){
            boolean ulang = true;
            while (ulang){
                System.out.println("\nPilih data yang ingin diubah:");
                System.out.println("1. Nomor Resi");
                System.out.println("2. Nama Pengirim");
                System.out.println("3. Nama Penerima");
                System.out.println("4. Nomor Telepon Penerima");
                System.out.println("5. Jenis Paket");
                System.out.println("6. Alamat Tujuan");
                System.out.println("7. Tanggal Pengiriman");
                System.out.println("8. Tanggal Perkiraan Sampai");
                System.out.println("9. Selesai");
                System.out.print("Pilih: ");
                int pilih = input.nextInt();
                input.nextLine();
                
                switch (pilih){
                    case 1:
                        System.out.println("Nomor Resi baru: ");
                        resiList.set(index, input.nextLine());
                        break;
                    case 2:
                        System.out.println("Masukkan Pengirim baru: ");
                        pengirimList.set(index, input.nextLine());
                        break;
                    case 3:
                        System.out.println("Masukkan Penerima baru: ");
                        penerimaList.set(index, input.nextLine());
                        break;
                    case 4:
                        System.out.println("Masukkan Nomor Telepon baru: ");
                        nomorTeleponPenerimaList.set(index, input.nextLine());
                        break;
                    case 5:
                        System.out.println("Masukkan Jenis Paket baru: ");
                        jenisPaketList.set(index, input.nextLine());
                        break;
                    case 6:
                        System.out.println("Masukkan Alamat Tujuan baru: ");
                        alamatTujuanList.set(index, input.nextLine());
                        break;
                    case 7:
                        System.out.println("Masukkan Tanggal Pengiriman: ");
                        tanggalPengirimanList.set(index, input.nextLine());
                        break;
                    case 8:
                        System.out.println("Masukkan Tanggal Perkiraan Sampai: ");
                        tanggalPerkiraanSampaiList.set(index, input.nextLine());
                        break;
                    case 9:
                        ulang = false;
                        System.out.println("Selesai update data.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");          
                }
            }
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }
    
    public static void hapusPaket(){
        tampilkanPaket();
        if (resiList.isEmpty()) return;
        
        System.out.println("Masukkan nomor data paket yang ingin di hapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        
        if (index >= 0 && index < resiList.size()){
            resiList.remove(index);
            pengirimList.remove(index);
            penerimaList.remove(index);
            nomorTeleponPenerimaList.remove(index);
            jenisPaketList.remove(index);
            alamatTujuanList.remove(index);
            tanggalPengirimanList.remove(index);
            tanggalPerkiraanSampaiList.remove(index);
            
            System.out.println("Data paket berhasil di hapus!");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }
    
    public static void keluarProgram(){
        System.out.println("Terima Kasih sudah menggunakan program ini!");
        System.exit(0);
    }
}

