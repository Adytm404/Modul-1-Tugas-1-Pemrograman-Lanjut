package com.nyan.tugas2;
import java.util.InputMismatchException;
import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner pilih = new Scanner(System.in);
        String opsi;
        int input;
        boolean session = true;
        main add = new main();

        do{
            try{

                System.out.println("Pilih menu untuk memulai: \n 1. Login Mahasiswa \n 2. Exit.");
                System.out.print("Pilih: ");
                input = pilih.nextInt();

                //input menu
                switch (input) {
                    case 1 -> add.mahasiswa();
                    case 2 -> session = false;
                    default -> System.out.println("Maaf menu tidak tersedia!");
                }

                //exception area menu
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Maaf terjadi kesalahan pada input Array!");

            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Maaf terjadi kesalahan pada input String!");
            }catch (InputMismatchException e){
                System.out.println("Maaf terjadi kesalahan pada input Menu!");
            }finally {
                System.out.print("\nApakah Ingin Mengulang Program ini (Y/N) \n");
                opsi = pilih.next();
                if((opsi.toUpperCase().compareTo("N")) == 0)
                    session = false;
            }
        }while (session);
    }

    void mahasiswa(){

        boolean check = true;

           long nimMhs, nim, year;
           String namMhs;
           Scanner inputin = new Scanner(System.in);

           System.out.print("Masukan Nama anda\t: ");
           namMhs = inputin.nextLine();

           do{

               //input NIM
               System.out.print("Masukan NIM anda\t: ");
               nimMhs = inputin.nextLong();
               nim = nimMhs;
               int length = Long.valueOf(nimMhs).toString().length();

               //check length NIM
               if(length == 15){

                   //crop part of NIM
                   String front_str = Long.toString(nim);
                   long new_nim = Long.parseLong(front_str.substring(4,12));

                   //check NIM true or false
                   if(new_nim == 10370311){
                       check = false;
                   }else {
                       System.out.println("NIM anda tidak sesuai!");
                   }
                   }else if(length > 15){
                       System.out.println("NIM yang anda masukan berlebih!");
                   }
                   else {
                       System.out.println("NIM yang anda masukan kurang!");
                   }

           }while (check);

           //check mhs class year
           String mhs_year = Long.toString(nim);
           year = Long.parseLong(mhs_year.substring(0,4));

           //show data mhs
           System.out.println("\nSelamat datang Mahasiswa angkatan " + year + "!");
           System.out.println("Bernama\t\t: " + namMhs);
           System.out.println("Dengan NIM\t: " + nim);
    }
}