import java.lang.*;
import java.util.Scanner;

public class Tugas4{

    public static void main(String []args){
        Scanner inputdata = new Scanner (System.in);
        int angka1;
        int angka2;
        int total;
        System.out.print("masukkan angka pertama : ");
        angka1 = inputdata.nextInt();
        System.out.print("masukkan angka kedua : ");
        angka2 = inputdata.nextInt();
        total = angka1+angka2;
        System.out.println("Hasil penjumlahan adalah "+ total);
    }
}
