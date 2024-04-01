package bai6;

import java.util.Arrays;

public class Bai6 {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Vong i:"+i);
            int currentNumber = arr[i];
            int j;
            System.out.println("=================");
            System.out.println(Arrays.toString(arr));
            for (j = i-1; j >= 0 && arr[j]>currentNumber ; j--) {
                System.out.println("Vong j: "+j);
                System.out.println("arr[j]"+arr[j]);
                System.out.println("Current Number: " + currentNumber);
                System.out.println("------");
                System.out.println(Arrays.toString(arr));
                arr[j+1] = arr[j];
                System.out.println("----");
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("j: "+j);
            System.out.println("j+1: "+(j+1));
            System.out.println("arr[j+1]: "+arr[j+1]);
            System.out.println("Current Number: " + currentNumber);
            arr[j+1] = currentNumber;
            System.out.println("arr[j+1]: "+arr[j+1]);
        }
    }

    public static void main(String[] args) {
        int[] arr =new int[]{6,8,5,18,9,7,2,22,5};
        insertionSort(arr);
    }
}
