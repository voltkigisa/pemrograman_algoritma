package Modular;

import java.util.Scanner;

public class TIMEmodular{
    int jam, menit, detik;
    void inputWaktu(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Jam: "); jam = sc.nextInt();
            while (jam < 0 || jam > 23) {
                System.out.print("Jam: "); jam = sc.nextInt();
            }

            System.out.print("Menit: "); menit = sc.nextInt();
            while (menit < 0 || menit > 59) {
                System.out.print("Menit: "); menit = sc.nextInt();
            }

            System.out.print("Detik: "); detik = sc.nextInt();
            while (detik < 0 || detik > 59) {
                System.out.print("Detik: "); detik = sc.nextInt();
            }
    }

    void outputWaktu(){
        System.out.println("Jamnya = "+jam+":"+menit+":"+detik+">");
    }

        public static void main(String[] args) {
            TIMEmodular R=new TIMEmodular();

            //input
            R.inputWaktu();
            R.outputWaktu();


            //output

        }
}