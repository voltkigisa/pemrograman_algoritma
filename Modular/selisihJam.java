package Modular; 

import java.util.Scanner;

public class selisihJam {
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

    void tampiljam(){
        System.out.println("jamnya : "+jam+" : "+menit+" : "+detik);
    }

    int jamToDetik(){
        return total_detik = (jam * 3600) + (menit * 60) + detik;
    }

    void detikToJam(int S){
        // selisihJam waktu = new selisihJam();
        jam = S /3600;
        int sjam=S % 3600;
        menit =sjam /60;
        detik=sjam%60;
    }

   static void selisih( selisihJam a, selisihJam b){
        int total1=a.jamToDetik();
        System.out.println(total1);
        int total2=b.jamToDetik();
        System.out.println(total2);

        int Selisih;
        if (total1 > total2) {
            Selisih=total1-total2;
        }else {
            Selisih=total2-total1;
            }

        System.out.println("selisih jam(format detik) : " + Selisih);

        System.out.println("selisih jam(format jam) : ");
        selisihJam waktu=new selisihJam();
        waktu.detikToJam(Selisih);
        waktu.tampiljam();

    }
    
    public static void main(String[] args) {
        selisihJam waktu1 = new selisihJam();
        selisihJam waktu2 = new selisihJam();

        waktu1.inputWaktu();
        waktu1.tampiljam();

        waktu2.inputWaktu();
        waktu2.tampiljam();

        selisih(waktu1, waktu2);
    }
}
