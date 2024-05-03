package kuliah.pengulangan;

import java.util.Scanner;

public class bilanganGenapKecilDari {
    public static void main(String[] args) {
    int X, N;

    //input
    Scanner sc = new Scanner(System.in);
    System.out.print("N= "); N=sc.nextInt();
    X=0;

    while (X < N) {
        System.out.println("X= "+X+" Genap");
        X=X+2;
    }
    System.out.println("Selesai");
    }
}