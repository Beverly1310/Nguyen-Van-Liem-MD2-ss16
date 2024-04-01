package bai2;

import java.util.Scanner;

public class Bai2 {
    	private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
    private static boolean findNumber(Scanner scanner, int[][] arr){
        System.out.println("Nhap so can tim");
        int inputNumber =Integer.parseInt(scanner.nextLine());
        boolean checkExist = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==inputNumber){
                    System.out.println("So can tim o vi tri: "+i);
                    checkExist=true;
                }
            }
        }
        return checkExist;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findNumber(scanner,getArr());
    }
}
