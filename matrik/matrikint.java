package matrik;
import java.util.Scanner;

public class matrikint {
    int N=2;int M=3;
    int [][]a=new int[N][M];

    void InitArray(){
        a[0][0]=45;
        a[0][1]=18; 
        a[0][2]=39;
        a[1][0]=10;
        a[1][1]=35;
        a[1][2]=45;
    }

    void ShowArray(){
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                System.out.print("a["+i+"]["+j+"]="+a[i][j]);
            }
            System.out.println();
        }
    }

    void rata(){
        double sum=0;
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                sum+=a[i][j];
            }
        }

        double rata2= sum/(N*M);
        System.out.println("Rata-rata = "+rata2);
    }

    double Rata_rata(){
        double sum=0;
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                sum+=a[i][j];
            }
        }

        // double rata2= sum/(N*M);
        return sum/(N*M);
    
    }

    public static void main(String[] args) {
        matrikint B= new matrikint(); 
        B.InitArray();
        B.ShowArray();
        B.rata();
        System.out.println("Rata-rata = "+B.Rata_rata());
    }
}