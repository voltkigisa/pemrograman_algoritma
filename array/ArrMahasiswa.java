package array;

import java.util.Scanner;

public class ArrMahasiswa {
    int N=5;
    Mahasiswa []a=new Mahasiswa[N];

    void InitArray(){
        
        Mahasiswa R1 = new Mahasiswa("123", "Andi", 3.5);
        Mahasiswa R2 = new Mahasiswa("234", "Budi", 3.6);
        Mahasiswa R3= new Mahasiswa("345", "Caca", 3.7);
        // Inisialisasi elemen lainnya dengan konstruktor default jika diperlukan
        a[0]=R1;
        a[1]=R2;
        a[2]=R3;
    }

    void BacaArray(){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<N;i++){
            System.out.println("a ["+(i+1)+"] = ");
            Mahasiswa R = new Mahasiswa();
            R.BacaMhs();
            a[i]=R;
        }
    }

    void ShowArray(){
        for (int i=0;i<N;i++){
            a[i].TulisMhs();
        }
    }

    void ShowCaca(){
        for (int i=0;i<N;i++){
            if (a[i].nama.equals("Caca")){
                a[i].TulisMhs();
            }
        }
    }

    public static void main(String[] args) {
        ArrMahasiswa B= new ArrMahasiswa(); 

        B.InitArray(); B.ShowArray(); B.ShowCaca();
        ArrMahasiswa A= new ArrMahasiswa(); A.BacaArray(); A.ShowArray();
    }
}
