package bai3;

import java.util.Scanner;

public class Bai3 {
    private static int[] getArr(Scanner scanner){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap gia tri cho phan tu thu: "+i);
                arr[i] = Integer.parseInt(scanner.nextLine());


        }
        return arr;
    }
    private static void findNumber(Scanner scanner, int[] arr){
        System.out.println("Nhap so can tim");
        int inputNumber =Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i]==inputNumber){
                    System.out.println("So can tim o vi tri: "+i);
                    index=i;
                }
        }
        if (index!=-1){
            System.out.println("vij tri cua gia tri can tim la: "+index);
        }
        else {
            System.out.println("Khong tim thay gia tri can tim");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findNumber(scanner,getArr(scanner));
    }
}
