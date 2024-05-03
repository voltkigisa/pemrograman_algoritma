package RECORD;

import java.util.Scanner;

public class jumlahharirrecord {
    int kode, tahun;
    int jumlahHari;
    public static void main(String[] args) {
        jumlahharirrecord JH = new jumlahharirrecord();

    //input
    Scanner sc = new Scanner(System.in);
    System.out.print("Tahun= "); JH.tahun=sc.nextInt();
    while (JH.tahun<0) {
        System.out.print("Tahun= "); JH.tahun=sc.nextInt();
    }
    System.out.print("kode Bulan= "); JH.kode=sc.nextInt();
    while (JH.kode<0 || JH.kode>12) {
        System.out.print("kode Bulan= "); JH.kode=sc.nextInt();
    }


    if (JH.kode == 1 || JH.kode == 3 || JH.kode == 5 || JH.kode == 7 || JH.kode == 8 || JH.kode == 10 || JH.kode == 12) {
    JH.jumlahHari = 31;
    System.out.println("Jumlah hari= " + JH.jumlahHari);
    } else if (JH.kode == 4 || JH.kode == 6 || JH.kode == 9 || JH.kode == 11) {
        JH.jumlahHari = 30;
        System.out.println("Jumlah hari= " + JH.jumlahHari);
            } else if (JH.kode == 2) {
                        if (JH.tahun % 4 == 0) {
                        JH.jumlahHari = 29;
                        } else {
                            JH.jumlahHari = 28;
                        }

                        System.out.println("Jumlah hari= " + JH.jumlahHari);
                    }

}
}
