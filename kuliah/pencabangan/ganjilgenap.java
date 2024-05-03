package kuliah.pencabangan;

import java.util.Scanner;

public class ganjilgenap {
    
    public static void main(String[] args){
        int x;

        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("X : "); x=sc.nextInt();

        //output
        if(x%2==1){
            System.out.println(x+" adalah bilangan ganjil");
        }else if(x%2==0){
            System.out.println(x+" adalah bilangan genap");
        }
    }
}