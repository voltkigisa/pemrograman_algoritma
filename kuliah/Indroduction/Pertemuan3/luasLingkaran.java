package kuliah.Indroduction.Pertemuan3;

import java.util.Scanner;

public class luasLingkaran {
    public static void main(String[] args) {
    int R;
    double L;

    //input
    Scanner sc = new Scanner(System.in);
        System.out.print("Nilai Jari-jari: "); R=sc.nextInt();
        L=3.14*R*R;
        System.out.println("Luas= "+L);
    }
}