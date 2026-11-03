//ScoreManager class that manages the score of the user
//This class allows setting and getting the score, as well as calculating the percentage based on total marks
//Created by: Sharifah Nur Farahin Binti Wan Bujang (106292)

public class ScoreManager {
    private int score;

    public void setScore (int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public double calcPercentage (int totalMarks) {
        return (score*100.0) / totalMarks;
    }
}