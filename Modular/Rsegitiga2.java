package Modular;

import java.util.Scanner;

public class Rsegitiga2 {
    double alas, tinggi, luas, keliling;
    static void HitungLuas(){
        //prosedurnya static artinya umum, bukan bagian kelas Rsegitiga
        Rsegitiga s= new Rsegitiga();
    
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Alas= "); s.alas=sc.nextDouble();
        System.out.print("Tinggi= "); s.tinggi=sc.nextDouble();
    
        s.luas =s.alas * s.tinggi/2;
        s.keliling = s.alas + s.tinggi + Math.sqrt(s.alas*s.alas + s.tinggi*s.tinggi);
    
        System.out.println("Alas= "+s.alas);
        System.out.println("Tinggi= "+s.tinggi);
        System.out.println("Luas= "+s.luas);
        System.out.println("Keliling= "+s.keliling);
    }
    public static void main(String[] args) {
        HitungLuas();
    }


}