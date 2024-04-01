package bai13;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[i] > arr[i + 1]) {
                    int tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                    needNextPass = true;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentMin= arr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex!=1){
                arr[currentMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }
    }
    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for ( j = i-1; j >=0 && arr[j]>current; j++) {
                arr[j+1] = arr[j];
            }
            arr[j+1]=current;
        }
    }
}
