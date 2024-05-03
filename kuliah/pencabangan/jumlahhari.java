package kuliah.pencabangan;

import java.util.Scanner;

public class jumlahhari {
    public static void main(String[] args) {
    int kode, tahun;
    int jumlahHari;

    //input
    Scanner sc = new Scanner(System.in);
    System.out.print("kode Bulan= "); kode=sc.nextInt();

    if (kode == 1 || kode == 3 || kode == 5 || kode == 7 || kode == 8 || kode == 10 || kode == 12) {
    jumlahHari = 31;
    System.out.println("Jumlah hari= " + jumlahHari);
    } else if (kode == 4 || kode == 6 || kode == 9 || kode == 11) {
        jumlahHari = 30;
        System.out.println("Jumlah hari= " + jumlahHari);
            } else if (kode == 2) {
                        System.out.print("Tahun= "); tahun=sc.nextInt();
                        if (tahun % 4 == 0) {
                        jumlahHari = 29;
                        } else {
                            jumlahHari = 28;
                        }

                        System.out.println("Jumlah hari= " + jumlahHari);
                    }

}
}
