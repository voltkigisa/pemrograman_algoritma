package kuliah.Indroduction.Pertemuan3;

import java.util.Scanner;

public class volumeTabung {
    public static void main(String[] args) {
    int R,T;
    double LL,V;

    //input
    Scanner sc = new Scanner(System.in);
        System.out.print("Nilai Jari-jari: "); R=sc.nextInt();
        System.out.print("Nilai Tinggi: "); T=sc.nextInt();
        LL=3.14*R*R;
        V=LL*T;
        System.out.println("Volume= "+V);
    }
}