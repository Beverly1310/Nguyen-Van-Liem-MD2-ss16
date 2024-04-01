package bai4;

import java.util.Scanner;

public class Bai4 {
    private static void findMax(Scanner scanner, int[] arr){
        System.out.println("Nhap so can tim");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int start = 0;
        int end= arr.length-1;
        int mid;
        while (end>=start){
             mid = start+(end-start)/2;
             if (arr[mid]==inputNumber){
                 System.out.println(arr[mid]);
                 return;
             }
           else if (arr[mid]>inputNumber) {
                 end = mid - 1;
             }
           else  if (arr[mid]<inputNumber){
                start = mid +1;
            }
        }
        System.out.println("Khong co so caan tim");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        Scanner scanner =new Scanner(System.in);
        findMax(scanner, arr);
    }
}
