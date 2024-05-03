package tugas2;

import java.util.Scanner;

// Contoh 6.5. Buatlah algoritma yang membaca dua buah bilangan bulat, lalu menentukan bilangan yang terbesar.

// Penyelesaian

// Misalkan kedua bilangan tersebut A dan B. Hanya ada dua kemungkinan bilangan terbesar, A atau B.
// Kita harus membandingkan kedua bilangan tersebut lalu menentukan yang terbesar.

// Analisis kasus:
// Kasus 1: jika A > B, maka tulis pesan "Bilangan terbesar = A" 
// Kasus 2: jika B >A, maka tulis pesan "Bilangan terbesar = B"

public class contoh6_5 {
    public static void main(String[] args) {
        int a, b;
        
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("A : "); a = sc.nextInt();
        System.out.print("B : "); b = sc.nextInt();

        // output
        if(a > b){
            System.out.println("Bilangan terbesar = "+a);
        }else if(b >= a){
            System.out.println("Bilangan terbesar = "+b);
        }
        
    }
}