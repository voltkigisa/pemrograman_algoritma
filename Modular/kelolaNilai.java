package Modular;

import java.util.Scanner;

public class kelolaNilai {
     int uts, uas, nilaiAkhir;
    String nama;
    char index;

    void inputNilai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama: "); nama = sc.nextLine();
            System.out.print("Nilai UTS : "); uts = sc.nextInt();
            while (uts < 0 || uts > 100) {
                System.out.print("Nilai UTS : "); uts = sc.nextInt();
            }

            System.out.print("Nilai UAS : "); uas = sc.nextInt();
            while (uas < 0 || uas > 100) {
                System.out.print("Nilai UAS : "); uas = sc.nextInt();
            }

            nilaiAkhir=hitungNilai();

        }


    int hitungNilai(){
        return (uts * 30 / 100) + (uas * 70 / 100);
    }
    
    void indexNilai(){

        if (nilaiAkhir >= 80) {
        index = 'A';
        } else if (nilaiAkhir < 80 && nilaiAkhir >= 70) {
                index = 'B';
                } else if (nilaiAkhir < 70 && nilaiAkhir >= 55) {
                        index = 'C';
                        } else if (nilaiAkhir < 55 && nilaiAkhir >= 40) {
                                index = 'D';
                                } else {
                                    index = 'E';
                                }
    }


    void outputNilai(){
        System.out.println(nama +" "+ nilaiAkhir +" "+ index);

        }

    public static void main(String[] args) {
        kelolaNilai N=new kelolaNilai();
        N.inputNilai();
        N.indexNilai();
        N.outputNilai();
}
}
