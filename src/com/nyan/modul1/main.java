package com.nyan.modul1;

public class main {
    public static void main(String[] args) {

        try {

            int[] arr = new int[5];
            arr[5] = 25;


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Exeption Array Code!");
        }
    }
}