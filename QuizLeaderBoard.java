//File: QuizLeaderBoard.java
//creator: Hanis
//Testor: Anastasia, Yvea, Farahin

public interface QuizLeaderBoard {
    void setScore(int score);
    void displayLeaderBoard();
    void saveData(String username, int score);
}