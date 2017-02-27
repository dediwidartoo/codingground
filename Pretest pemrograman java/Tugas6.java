import java.lang.*;
import java.util.Scanner;

public class Tugas6{

    public static void main(String []args){
        Scanner inputdata = new Scanner (System.in);
        int nilai;
        System.out.print("masukkan nilai siswa : ");
        nilai = inputdata.nextInt();
        if (nilai>60){
            System.out.println("Selamat, anda lulus");
        }else{
            System.out.println("Maaf, anda tidak lulus");
        }
    }
}
