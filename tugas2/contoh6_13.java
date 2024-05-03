package tugas2;

import java.util.Scanner;

// Contoh 6.7. Karyawan honorer di PT "ABC" digaji berdasarkan jumlah jam kerjanya selama satu minggu. 
// Upah per jam misalkan Rp2000,00. Bila jumlah jam kerja lebih besar dari 48 jam, 
// maka sisanya dianggap sebagai jam lembur. Upah lembur misalkan Rp3000,00/jam.
// Tulislah algoritma yang membaca jumlah jam kerja seorang karyawan selama satu minggu, 
// lalu menentukan upah mingguannya

// Analisis kasus:
// Kasus 1: jika JJK ≤48, maka upah = JJK *2000 

// Kasus 2: 
// jika JJK > 48, 
// maka=lembur JJK-48 
// upah = 48*2000 + lembur*3000

public class contoh6_13 {
    public static void main(String[] args) {
        int x;
      
        
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka : "); x = sc.nextInt();
        //proses

        // output
        
        if(x > 0){
            System.out.print("Positif");
        }else if(x < 0){
                System.out.print("Negatif");
            }else if(x == 0){
                System.out.print("Nol");
            }
    }
}