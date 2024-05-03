package Modular;

import java.util.Scanner;

public class C1PlanoPilpresModular {
    String NoTPS;
    String kec, kabkota, prov;
    int p1,p2,p3,ts,tts,tm,ttm,td;
    int max=300;
    boolean cek;
    double pp1,pp2,pp3;

    void Input(){

    Scanner input = new Scanner(System.in);
    System.out.print("suara Paslon 1: "); p1 = input.nextInt(); cek=(p1<=max);
    System.out.println("suara Paslon 1: "+p1+cek);
    while (cek==false) {
        System.out.print("suara Paslon 1: "); p1 = input.nextInt(); cek=(p1<=max);
        System.out.println("suara Paslon 1: "+p1+cek);
    }
    
    System.out.print("suara Paslon 2: "); p2 = input.nextInt(); cek=(p2<=max-p1);
    System.out.println("suara Paslon 2: "+p2+cek);
    while (cek==false) {
        System.out.print("suara Paslon 2: "); p2 = input.nextInt(); cek=(p2<=max-p1);
        System.out.println("suara Paslon 2: "+p2+cek);
    }
    
    System.out.print("suara Paslon 3: "); p3 = input.nextInt(); cek=(p3<=max-p1+p2);
    System.out.println("suara Paslon 3: "+p3+cek);
    while (cek==false) {
        System.out.print("suara Paslon 3: "); p3 = input.nextInt(); cek=(p3<=max-p1+p2);
        System.out.println("suara Paslon 3: "+p3+cek);
    }
    
    System.out.print("Total Suara Sah: "); ts = input.nextInt(); cek=(ts<=max) && (ts==p1+p2+p3);
    System.out.println("Total Suara Sah: "+ts+cek);
    while (cek==false) {
        System.out.print("Total Suara Sah: "); ts = input.nextInt(); cek=(ts<=max) && (ts==p1+p2+p3);
        System.out.println("Total Suara Sah: "+ts+cek);
    }
    
    System.out.print("Total Suara Tidak Sah: "); tts = input.nextInt(); cek=(tts<=max-ts);
    System.out.println("Total Suara Tidak Sah: "+tts+cek);
    while (cek==false) {
        System.out.print("Total Suara Tidak Sah: "); tts = input.nextInt(); cek=(tts<=max-ts);
        System.out.println("Total Suara Tidak Sah: "+tts+cek);
    }
    
    System.out.print("Total Memilih: "); tm = input.nextInt(); cek=(tm<=max) && (tm==p1+p2+p3+tts);
    System.out.println("Total Memilih: "+tm+cek);
    while (cek==false) {
        System.out.print("Total Memilih: "); tm = input.nextInt(); cek=(tm<=max) && (tm==p1+p2+p3+tts);
        System.out.println("Total Memilih: "+tm+cek);
    }
    
    System.out.print("Total Tidak Memilih: "); ttm = input.nextInt(); cek=(ttm<=max-tm);
    System.out.println("Total Tidak Memilih: "+ttm+cek);
    while (cek==false) {
        System.out.print("Total Tidak Memilih: "); ttm = input.nextInt(); cek=(ttm<=max-tm);
        System.out.println("Total Tidak Memilih: "+ttm+cek);
    }
    
    System.out.print("Total dapat: "); td = input.nextInt(); cek=(td<=max);
    System.out.println("Total Dapat: "+td+cek);
    while (cek==false) {
        System.out.print("Total Dapat: "); td = input.nextInt(); cek=(td<=max);
        System.out.println("Total Dapat: "+td+cek);
    }
    }

    void HitungPersen(){
        pp1=(double)p1/ts*100;
        pp2=(double)p2/ts*100;
        pp3=(double)p3/ts*100;
    }

    void output(){
        System.out.println("Total Perolehan Suara Paslon: ");
        System.out.println("P1= "+pp1+"% P2= "+pp2+"% P3= "+pp3+"%");
    }


    public static void main(String[] args){
        C1PlanoPilpresModular CT = new C1PlanoPilpresModular();
        //input
        //perolehan suara
        CT.Input();
        //proses presentase
        CT.HitungPersen();
        //output
        CT.output();
    }
}
