package bai14;

public class SortingStudent {
    public static void bubbleSort(Student[] arrStudent) {
        boolean needNextPass = true;
        for (int i = 1; i < arrStudent.length; i++) {
            needNextPass = false;
            for (int j = 0; j < arrStudent.length - i; j++) {
                if (arrStudent[i].getScore() > arrStudent[i + 1].getScore()) {
                    Student tg = arrStudent[i];
                    arrStudent[i] = arrStudent[j];
                    arrStudent[j] = tg;
                    needNextPass = true;
                }
            }
        }
    }

    public static void selectionSort(Student[] arrStudent) {
        for (int i = 0; i < arrStudent.length; i++) {
            Student currentMinScore = arrStudent[i];
            int currentMinScoreIndex = i;
            for (int j = i + 1; j < arrStudent.length; j++) {
                if (currentMinScore.getScore() > arrStudent[j].getScore()) {
                    currentMinScore = arrStudent[j];
                    currentMinScoreIndex = j;
                }
            }
            if (currentMinScoreIndex!=1){
                arrStudent[currentMinScoreIndex]=arrStudent[i];
                arrStudent[i]=currentMinScore;
            }
        }
    }
    public void insertionSort(Student[] arrStudent){
        for (int i = 1; i < arrStudent.length; i++) {
            Student currentStudent = arrStudent[i];
            int j;
            for ( j = i-1; j >=0 && arrStudent[j].getScore()>currentStudent.getScore(); j++) {
                arrStudent[j+1] = arrStudent[j];
            }
            arrStudent[j+1]=currentStudent;
        }
    }
}
