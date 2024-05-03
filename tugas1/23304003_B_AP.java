import java.util.Scanner;
class MenghitungGaji{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hariKerja, jamLembur, gajiLembur = 15000, gajiPerHari = 200000;
        double totalGaji;
    
        System.out.println("Masukkan berapa hari bekerja: ");
        hariKerja = input.nextInt();
        System.out.println("Masukkan jam lembur: ");
        jamLembur = input.nextInt();

        totalGaji = (hariKerja * gajiPerHari)+(jamLembur * gajiLembur);

        System.out.println("Total gaji: " + totalGaji);
    }
}