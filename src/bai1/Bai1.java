package bai1;

import java.util.Arrays;

public class Bai1 {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        int[] intArr = getArr();
        System.out.println(Arrays.toString(intArr));
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i]>max){
                max=intArr[i];
            }
        }
        System.out.println(" So lon nhat la: " + max);
    }
}
