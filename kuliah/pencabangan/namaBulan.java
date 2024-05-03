package kuliah.pencabangan;

import java.util.Scanner;

public class namaBulan {
    public static void main(String[] args) {
        int kode;
        String nama;

        // input
    Scanner sc = new Scanner(System.in);
    System.out.print("Kode bulan (1...12) : ");kode=sc.nextInt();
    
    //proses
    if (kode == 1) {
        nama = "Januari";
        } else if (kode == 2) {
                nama = "Februari";
                } else if (kode == 3) {
                    nama = "Maret";
                    } else if (kode == 4) {
                        nama = "April";
                        } else if (kode == 5) {
                            nama = "Mei";
                            } else if (kode == 6) {
                                nama = "Juni";
                                } else if (kode == 7) {
                                    nama = "Juli";
                                    } else if (kode == 8) {
                                        nama = "Agustus";
                                        } else if (kode == 9) {
                                            nama = "September";
                                            } else if (kode == 10) {
                                                nama = "Oktober";
                                                } else if (kode == 11) {
                                                    nama = "November";
                                                    } else if (kode == 12) {
                                                        nama = "Desember";
                                                        } else {
                                                            nama = "Tidak ada";
                                                        }

        System.out.println("Nama bulan: " + nama);
    }
}