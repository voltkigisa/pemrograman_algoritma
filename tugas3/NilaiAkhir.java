package tugas3;

import java.util.Scanner;

public class NilaiAkhir {

    public static void main(String[] args) {
        int uts, uas, tugas, hadir, nilaiAkhir,N,i;
        String nama;
        char index;


        //input
        Scanner sc = new Scanner(System.in);

        i=1;
        System.out.print("Jumlah Peserta Mahasiswa AlPro: "); N=sc.nextInt();
        while (i<=N) {

            System.out.println("Peserta ke-"+i);
            
            nama = sc.nextLine(); System.out.print("Nama: "); nama = sc.nextLine();

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

            //proses
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

        //output
        System.out.println(nama +" "+ nilaiAkhir +" "+ index);
        i++;
    }
}
    
}
