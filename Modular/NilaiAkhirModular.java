package Modular;

import java.util.Scanner;

public class NilaiAkhirModular {
    int uts, uas, tugas, hadir, nilaiAkhir;
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

            System.out.print("Nilai Tugas : "); tugas = sc.nextInt();
            while (tugas < 0 || tugas > 100) {
                System.out.print("Nilai Tugas : "); tugas = sc.nextInt();
            }

            System.out.print("Nilai Kehadiran : "); hadir = sc.nextInt();
            while (hadir < 0 || hadir > 100) {
                System.out.print("Nilai Kehadiran : "); hadir = sc.nextInt();
            }
        }

    void indexNilai(){
        nilaiAkhir = (uts * 30 / 100) + (uas * 30 / 100) + (tugas * 30 / 100) + (hadir * 10 / 100);

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
        NilaiAkhirModular N=new NilaiAkhirModular();
        N.inputNilai();
        N.indexNilai();
        N.outputNilai();
}
}
