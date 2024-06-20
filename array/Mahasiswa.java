package array;

import java.util.Scanner;

public class Mahasiswa {
    String nrp, nama;
    double ipk;

     // Konstruktor default
     Mahasiswa() {
        
     }

     // Konstruktor dengan parameter
     Mahasiswa(String a, String b, double c) {
         this.nrp = a;
         this.nama = b;
         this.ipk = c;
     }

    void BacaMhs(){
         Scanner sc = new Scanner(System.in);
            System.out.print("NRP: "); nrp = sc.next();
            System.out.print("Nama: "); nama = sc.next();
            System.out.print("IPK: "); ipk = sc.nextDouble();
    }

    void TulisMhs(){
        System.out.print(nrp+","+nama+","+ipk);
    }

    public static void main(String[] args){
        Mahasiswa A= new Mahasiswa();

        A.BacaMhs();
        A.TulisMhs();
    }
    
}
