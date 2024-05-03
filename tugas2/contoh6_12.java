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

public class contoh6_12 {
    public static void main(String[] args) {
        String nama ;
        char golongan;
        int jjk, lembur;
      
        
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Karyawan : "); nama = sc.nextLine();
        System.out.print("Gologan : "); golongan = sc.next() .charAt(0); sc.nextLine();
        System.out.print("Jumlah Jam Kerja : "); jjk = sc.nextInt();

        //proses

        // output
        if(golongan == 'A'){
            golongan = 4000;
        }else if(golongan == 'B'){
            golongan = 5000;
        }else if(golongan == 'C'){
            golongan = 6000;
        }else if(golongan == 'D'){
            golongan = 7500;
        }
        
        if(jjk <= 48){
            System.out.print("Jumlah upah = "+jjk*golongan);
        }else if(jjk > 48){
            lembur = jjk-48;
            System.out.print("Jumlah Upah = "+48*golongan + lembur*3000);
        }
        
    }
}