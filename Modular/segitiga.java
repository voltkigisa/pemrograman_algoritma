package Modular;

import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
    double alas, tinggi, luas, keliling;

    //input
    Scanner sc = new Scanner(System.in);
    System.out.print("Alas= "); alas=sc.nextDouble();
    System.out.print("Tinggi= "); tinggi=sc.nextDouble();

    luas =alas * tinggi/2;
    keliling = alas + tinggi + Math.sqrt(alas*alas + tinggi*tinggi);

    System.out.println("Alas= "+alas);
    System.out.println("Tinggi= "+tinggi);
    System.out.println("Luas= "+luas);
    System.out.println("Keliling= "+keliling);
    }


}