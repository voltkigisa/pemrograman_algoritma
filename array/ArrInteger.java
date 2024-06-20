package array;

import java.util.Scanner;

public class ArrInteger {
    int N=5;
    int []a=new int[N];

    void InitArray(){
        a[0]=45;
        a[1]=18;
        a[2]=39;
        a[3]=22;
        a[4]=35;
    }
        
    void BacaArray(){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<N;i++){
            System.out.println("a ["+(i+1)+"] = ");
            a[i]=sc.nextInt();
        }
    }

    void ShowArray(){
        for (int i=0;i<N;i++){
            System.out.println("a ["+(i+1)+"] = "+a[i]);
        }
    }
        
        public static void main(String[] args) {
            ArrInteger A= new ArrInteger(); A.BacaArray(); A.ShowArray();
            ArrInteger B= new ArrInteger(); B.InitArray(); B.ShowArray();
        }
 }
