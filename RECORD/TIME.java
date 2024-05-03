package RECORD;

import java.util.Scanner;

public class TIME{        
    int jam, menit, detik;

        public static void main(String[] args) {
            TIME T=new TIME();

            Scanner sc = new Scanner(System.in);
            System.out.print("Jam: "); T.jam = sc.nextInt();
            while (T.jam < 0 || T.jam > 23) {
                System.out.print("Jam: "); T.jam = sc.nextInt();
            }

            System.out.print("Menit: "); T.menit = sc.nextInt();
            while (T.menit < 0 || T.menit > 59) {
                System.out.print("Menit: "); T.menit = sc.nextInt();
            }

            System.out.print("Detik: "); T.detik = sc.nextInt();
            while (T.detik < 0 || T.detik > 59) {
                System.out.print("Detik: "); T.detik = sc.nextInt();
            }

            System.out.print("Jamnya <"+T.jam+":"+T.menit+":"+T.detik+">");
        }
}