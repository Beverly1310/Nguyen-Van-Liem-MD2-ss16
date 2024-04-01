package bai11;

public class Sorting {
    public static void bubbleSort(FootballTeam[] arrFootballTeam) {
        boolean needNextPass = true;
        for (int i = 1; i < arrFootballTeam.length; i++) {
            needNextPass = false;
            for (int j = 0; j < arrFootballTeam.length - i; j++) {
                if (arrFootballTeam[i].getScore() > arrFootballTeam[i + 1].getScore()) {
                    FootballTeam tg = arrFootballTeam[i];
                    arrFootballTeam[i] = arrFootballTeam[j];
                    arrFootballTeam[j] = tg;
                    needNextPass = true;
                }
            }
        }
    }

    public static void selectionSort(FootballTeam[] arrFootballTeam) {
        for (int i = 0; i < arrFootballTeam.length; i++) {
            FootballTeam currentMinScore = arrFootballTeam[i];
            int currentMinScoreIndex = i;
            for (int j = i + 1; j < arrFootballTeam.length; j++) {
                if (currentMinScore.getScore() > arrFootballTeam[j].getScore()) {
                    currentMinScore = arrFootballTeam[j];
                    currentMinScoreIndex = j;
                }
            }
            if (currentMinScoreIndex!=1){
                arrFootballTeam[currentMinScoreIndex]=arrFootballTeam[i];
                arrFootballTeam[i]=currentMinScore;
            }
        }
    }
    public void insertionSort(FootballTeam[] arrFootballTeam){
        for (int i = 1; i < arrFootballTeam.length; i++) {
            FootballTeam currentTeam = arrFootballTeam[i];
            int j;
            for ( j = i-1; j >=0 && arrFootballTeam[j].getScore()>currentTeam.getScore(); j++) {
                arrFootballTeam[j+1] = arrFootballTeam[j];
            }
            arrFootballTeam[j+1]=currentTeam;
        }
    }
}
