package Modular;

import java.util.Scanner;

public class Rsegitiga3 {
    double alas, tinggi, luas, keliling;
    void input(){        
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Alas= "); alas=sc.nextDouble();
        System.out.print("Tinggi= ");tinggi=sc.nextDouble();
        
    }
    void HitungLuas(){
        luas =alas * tinggi/2;
    }
    
    void HitungKeliling(){
        keliling = alas + tinggi + Math.sqrt(alas*alas + tinggi*tinggi);
    }

    void output(){
        System.out.println("Alas= "+alas);
        System.out.println("Tinggi= "+tinggi);
        System.out.println("Luas= "+luas);
        System.out.println("Keliling= "+keliling);
    }
    public static void main(String[] args) {
        Rsegitiga3 s= new Rsegitiga3();
        s.input();
        s.HitungLuas();
        s.HitungKeliling();
        s.output();

        Rsegitiga3 s2= new Rsegitiga3();
        s2.input();
        s2.HitungLuas();
        s2.HitungKeliling();
        s2.output();
    }


}