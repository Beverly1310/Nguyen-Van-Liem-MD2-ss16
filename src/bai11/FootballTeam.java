package bai11;

public class FootballTeam {
    private int Id;
    private String Name;
    private int numbberOfPlayer;
    private int score;

    public FootballTeam() {
    }

    public FootballTeam(int id, String name, int numbberOfPlayer, int score) {
        Id = id;
        Name = name;
        this.numbberOfPlayer = numbberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumbberOfPlayer() {
        return numbberOfPlayer;
    }

    public void setNumbberOfPlayer(int numbberOfPlayer) {
        this.numbberOfPlayer = numbberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
