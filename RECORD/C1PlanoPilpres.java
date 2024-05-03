package RECORD;

import java.util.Scanner;

public class C1PlanoPilpres {
    String NoTPS;
    String kec, kabkota, prov;
    int p1,p2,p3,ts,tts,tm,ttm,td;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max=300;
        boolean cek;
        C1PlanoPilpres CT = new C1PlanoPilpres();
        
        //input
       /* System.out.print("Provinsi: "); prov= input.nextLine();
        System.out.print("Kab/Kota: "); kabkota= input.nextLine();
        System.out.print("Kecamatan: "); kec= input.nextLine();
        System.out.print("TPS: "); tps= input.nextLine();
        */
        
        
        //perolehan suara
        
        System.out.print("suara Paslon 1: "); CT.p1 = input.nextInt(); cek=(CT.p1<=max);
        System.out.println("suara Paslon 1: "+CT.p1+cek);
        while (cek==false) {
            System.out.print("suara Paslon 1: "); CT.p1 = input.nextInt(); cek=(CT.p1<=max);
            System.out.println("suara Paslon 1: "+CT.p1+cek);
        }
        
        System.out.print("suara Paslon 2: "); CT.p2 = input.nextInt(); cek=(CT.p2<=max-CT.p1);
        System.out.println("suara Paslon 2: "+CT.p2+cek);
        while (cek==false) {
            System.out.print("suara Paslon 2: "); CT.p2 = input.nextInt(); cek=(CT.p2<=max-CT.p1);
            System.out.println("suara Paslon 2: "+CT.p2+cek);
            
        }
        
        System.out.print("suara Paslon 3: "); CT.p3 = input.nextInt(); cek=(CT.p3<=max-CT.p1+CT.p2);
        System.out.println("suara Paslon 3: "+CT.p3+cek);
        while (cek==false) {
            System.out.print("suara Paslon 3: "); CT.p3 = input.nextInt(); cek=(CT.p3<=max-CT.p1+CT.p2);
            System.out.println("suara Paslon 3: "+CT.p3+cek);
        }
        
        System.out.print("Total Suara Sah: "); CT.ts = input.nextInt(); cek=(CT.ts<=max) && (CT.ts==CT.p1+CT.p2+CT.p3);
        System.out.println("Total Suara Sah: "+CT.ts+cek);
        while (cek==false) {
            System.out.print("Total Suara Sah: "); CT.ts = input.nextInt(); cek=(CT.ts<=max) && (CT.ts==CT.p1+CT.p2+CT.p3);
            System.out.println("Total Suara Sah: "+CT.ts+cek);
        }
        
        System.out.print("Total Suara Tidak Sah: "); CT.tts = input.nextInt(); cek=(CT.tts<=max-CT.ts);
        System.out.println("Total Suara Tidak Sah: "+CT.tts+cek);
        while (cek==false) {
            System.out.print("Total Suara Tidak Sah: "); CT.tts = input.nextInt(); cek=(CT.tts<=max-CT.ts);
            System.out.println("Total Suara Tidak Sah: "+CT.tts+cek);
        }
        
        System.out.print("Total Memilih: "); CT.tm = input.nextInt(); cek=(CT.tm<=max) && (CT.tm==CT.p1+CT.p2+CT.p3+CT.tts);
        System.out.println("Total Memilih: "+CT.tm+cek);
        while (cek==false) {
            System.out.print("Total Memilih: "); CT.tm = input.nextInt(); cek=(CT.tm<=max) && (CT.tm==CT.p1+CT.p2+CT.p3+CT.tts);
            System.out.println("Total Memilih: "+CT.tm+cek);
        }
        
        System.out.print("Total Tidak Memilih: "); CT.ttm = input.nextInt(); cek=(CT.ttm<=max-CT.tm);
        System.out.println("Total Tidak Memilih: "+CT.ttm+cek);
        while (cek==false) {
            System.out.print("Total Tidak Memilih: "); CT.ttm = input.nextInt(); cek=(CT.ttm<=max-CT.tm);
            System.out.println("Total Tidak Memilih: "+CT.ttm+cek);
        }
        
        System.out.print("Total dapat: "); CT.td = input.nextInt(); cek=(CT.td<=max);
        System.out.println("Total Dapat: "+CT.td+cek);
        while (cek==false) {
            System.out.print("Total Dapat: "); CT.td = input.nextInt(); cek=(CT.td<=max);
            System.out.println("Total Dapat: "+CT.td+cek);
        }

        //proses presentasi

        double pp1,pp2,pp3;
        pp1=(double)CT.p1/CT.ts*100;
        pp2=(double)CT.p2/CT.ts*100;
        pp3=(double)CT.p3/CT.ts*100;

        System.out.println("Total Perolehan Suara Paslon: ");
        System.out.println("P1= "+pp1+"% P2= "+pp2+"% P3= "+pp3+"%");
        
        
        
    }
}
