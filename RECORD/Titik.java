package RECORD;

import java.util.Scanner;

public class Titik{
    float x, y;

        public static void main(String[] args) {
            Titik T= new Titik();
            Titik T2= new Titik();

            Scanner sc = new Scanner(System.in);
            System.out.print("Titik Pertama");
            System.out.print("x: "); T.x = sc.nextFloat();
            System.out.print("y: "); T.y = sc.nextFloat();

            System.out.println("x : "+T.x);
            System.out.println("y : "+T.y);
            System.out.println("Titik Kedua");
            System.out.print("x: "); T2.x = sc.nextFloat();
            System.out.print("y: "); T2.y = sc.nextFloat();

            System.out.println("x : "+T2.x);
            System.out.println("y : "+T2.y);

        }
}