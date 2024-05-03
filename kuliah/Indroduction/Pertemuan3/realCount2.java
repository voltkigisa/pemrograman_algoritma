package kuliah.Indroduction.Pertemuan3;

import java.util.Scanner;

public class realCount2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p1,p2,p3,ts,tts,tm,ttm,td;
        int max=300;
        boolean cek;
        
        
        //input
        
        System.out.print("suara Paslon 1: "); p1 = input.nextInt(); cek=(p1<=max);
        System.out.println("suara Paslon 1: "+p1+cek);
        
        System.out.print("suara Paslon 2: "); p2 = input.nextInt(); cek=(p2<=max);
        System.out.println("suara Paslon 2: "+p2+cek);
        
        System.out.print("suara Paslon 3: "); p3 = input.nextInt(); cek=(p3<=max);
        System.out.println("suara Paslon 3: "+p3+cek);

        System.out.print("Total Suara Sah: "); ts = input.nextInt(); cek=(ts<=max) && (ts==p1+p2+p3);
        System.out.println("Total Suara Sah: "+ts+cek);

        System.out.print("Total Suara Tidak Sah: "); tts = input.nextInt(); cek=(tts<=max-ts);
        System.out.println("Total Suara Tidak Sah: "+tts+cek);
        
        System.out.print("Total Memilih: "); tm = input.nextInt(); cek=(tm<=max) && (tm==p1+p2+p3+tts);
        System.out.println("Total Memilih: "+tm+cek);
        
        System.out.print("Total Tidak Memilih: "); ttm = input.nextInt(); cek=(ttm<=max-tm);
        System.out.println("Total Tidak Memilih: "+ttm+cek);
        
        System.out.print("Total dapat: "); td = input.nextInt(); cek=(td<=max);
        System.out.println("Total Dapat: "+td+cek);

        //output

        
    }
}
