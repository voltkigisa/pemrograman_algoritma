package kuliah.Indroduction.Pertemuan3;

import java.util.Scanner;

public class KonversiTotaldetik {
    public static void main(String[] args) {
    int TotalD, jam, menit, detik;
    double L;

    //input
    Scanner sc = new Scanner(System.in);
        System.out.print("Total Detik: "); TotalD=sc.nextInt();
        jam=TotalD/3600;
        menit=(TotalD%3600)/60;
        detik=(TotalD%3600)%60;


        System.out.println("Total Detik= "+TotalD);
        System.out.println(jam+" : "+menit+" : "+detik);
    }
}