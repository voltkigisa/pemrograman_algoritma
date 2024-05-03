package kuliah.pengulangan;

import java.util.Scanner;

public class ValidasiJam{
    public static void main(String[] args) {
    int jam, menit, detik;

    //input
    Scanner sc = new Scanner(System.in);
    System.out.print("Jam= "); jam=sc.nextInt();
    while (jam < 0 || jam > 23) {
        System.out.print("Jam= "); jam=sc.nextInt();
    }

    System.out.print("Menit= "); menit=sc.nextInt();
    while (menit < 0 || menit > 59) {
        System.out.print("Menit= "); menit=sc.nextInt();
    }

    System.out.print("Detik= "); detik=sc.nextInt();
    while (detik < 0 || detik > 59) {
        System.out.print("Detik= "); detik=sc.nextInt();
    }

    System.out.println(jam+" : "+menit+" : "+detik);
    }
}