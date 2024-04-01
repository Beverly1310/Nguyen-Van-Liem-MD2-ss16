package bai7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai7 {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }


    private static int findIndex(Integer[] arr, int number){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (end >= start){
            mid = start + (end - start) / 2;
            if (arr[mid] == number){
                return mid;
            }
            else if (arr[mid] > number) {
                start = mid + 1;
            }
            else if (arr[mid] < number){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap min: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap max: ");
        int max = Integer.parseInt(scanner.nextLine());

        int indexMax = findIndex(arr, max);
        int indexMin = findIndex(arr, min);

        if (indexMin == -1 || indexMax == -1) {
            System.out.println("Min hoac Max khong ton tai trong mang.");
            return;
        }
        int countNumber = indexMin - indexMax - 1;
        if (countNumber <= 0) {
            System.out.println("Khong co gia tri nao trong khoang min, max.");
            return;
        }

        System.out.println("So cac gia tri trong khoang min, max la: " + countNumber);
        for (int i = indexMax + 1; i < indexMin; i++) {
            System.out.println(arr[i]);
        }
    }
}
