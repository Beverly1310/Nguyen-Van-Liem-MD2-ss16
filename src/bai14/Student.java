package bai14;

public class Student {
    private int Id;
    private String Name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        Id = id;
        Name = name;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
