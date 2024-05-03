package Modular; 

import java.util.Scanner;

public class waktuKeDetik {
    int jam, menit, detik, total_detik;
    Scanner input;

    void inputWaktu(){
        input = new Scanner(System.in);
        System.out.print("Jam: "); jam = input.nextInt();
        while (jam < 0 || jam > 23) {
            System.out.print("Jam: "); jam = input.nextInt();
        }

        System.out.print("Menit: "); menit = input.nextInt();
        while (menit < 0 || menit > 59) {
            System.out.print("Menit: "); menit = input.nextInt();
        }

        System.out.print("Detik: "); detik = input.nextInt();
        while (detik < 0 || detik > 59) {
            System.out.print("Detik: "); detik = input.nextInt();
        }
    }

    int hitungDetik(){
        total_detik = (jam * 3600) + (menit * 60) + detik;
        return total_detik;
    }
    
    public static void main(String[] args) {
        waktuKeDetik waktu = new waktuKeDetik();

        waktu.inputWaktu();
        System.out.println("Total detik: "+waktu.hitungDetik());
    }
}