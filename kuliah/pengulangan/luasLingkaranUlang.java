package kuliah.pengulangan;

import java.util.Scanner;

public class luasLingkaranUlang {
    public static void main(String[] args) {
    int R, i;
    double L;

    //input
    Scanner sc = new Scanner(System.in);
    
    i=1;
    while (i<=10) {
        System.out.print("Nilai Jari-jari: "); R=sc.nextInt();
        L=3.14*R*R;
        System.out.println("Luas= "+L);
        i++;
    }

    // for(i=1; i<=10; i++) {
    //     System.out.print("Nilai Jari-jari: "); R=sc.nextInt();
    //     L=3.14*R*R;
    //     System.out.println("Luas= "+L);
    // }
    System.out.println("Selesai");
    }
}