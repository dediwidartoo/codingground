import java.lang.*;
import java.util.Scanner;

public class Tugas7{

    public static void main(String []args){
        Scanner inputdata = new Scanner (System.in);
        System.out.print("masukkan angka : ");
        int romawi;
        romawi = inputdata.nextInt();
        if (romawi==1){
            System.out.println("angka "+ romawi +", angka romawinya : I");
        }else if(romawi==2){
            System.out.println("angka "+ romawi +", angka romawinya : II");
        }else if(romawi==3){
            System.out.println("angka "+ romawi +", angka romawinya : III");
        }else if(romawi==4){
            System.out.println("angka "+ romawi +", angka romawinya : IV");
        }else if(romawi==5){
            System.out.println("angka "+ romawi +", angka romawinya : V");
        }else if(romawi==6){
            System.out.println("angka "+ romawi +", angka romawinya : VI");
        }else if(romawi==7){
            System.out.println("angka "+ romawi +", angka romawinya : VII");
        }else if(romawi==8){
            System.out.println("angka "+ romawi +", angka romawinya : VIII");
        }else if(romawi==9){
            System.out.println("angka "+ romawi +", angka romawinya : IX");
        }else if(romawi==10){
            System.out.println("angka "+ romawi +", angka romawinya : X");
        }else{
            System.out.println("Nomor salah");
        }
    }
}
