package kuliah.Indroduction.Pertemuan3;

import java.util.Scanner;

public class realCount {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p1,p2,p3,ts,tts,tm,ttm,td;
    
        //input
        System.out.print("suara Paslon 1: "); p1 = input.nextInt();
        System.out.print("suara Paslon 2: "); p2 = input.nextInt();
        System.out.print("suara Paslon 3: "); p3 = input.nextInt();
        System.out.print("Total Suara Sah: "); ts = input.nextInt();
        System.out.print("Total Suara Tidak Sah: "); tts = input.nextInt();
        System.out.print("Total Memilih: "); tm = input.nextInt();
        System.out.print("Total Tidak Memilih: "); ttm = input.nextInt();
        System.out.print("Total dapat: "); td = input.nextInt();

        //output
        System.out.println("suara Paslon 1: "+p1);
        System.out.println("suara Paslon 2: "+p2);
        System.out.println("suara Paslon 3: "+p3);
        System.out.println("Total Suara Sah: "+ts);
        System.out.println("Total Suara Tidak Sah: "+tts);
        System.out.println("Total Memilih: "+tm);
        System.out.println("Total Tidak Memilih: "+ttm);
        System.out.print("Total Dapat : "+td);

        
    }
}
