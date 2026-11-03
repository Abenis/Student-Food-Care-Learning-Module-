//File: LeaderBoard.java 
//created by: Hanis
//this is the LeaderBoard for the QuizModule
//Testor: Anastasia, Yvea, Farahin
//29/5/2026
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class LeaderBoard implements QuizLeaderBoard {
    private User user;
    private JFrame leaderboard;
    private int score;
    private JButton btnSave;

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void saveData(String username, int score) {
            try (FileWriter fw = new FileWriter("leaderboard.txt", true)) {
                fw.write(username + "," + score + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }

    @Override   
    public void displayLeaderBoard() {

    JFrame frame = new JFrame("Leaderboard");
    frame.setSize(300, 400);
    frame.setLocationRelativeTo(null);

    JTextArea area = new JTextArea();
    area.setEditable(false);

    StringBuilder sb = new StringBuilder();
    sb.append("************* LEADERBOARD *************\n\n");
    
    ArrayList<String[]> scores = new ArrayList<>();

    try (BufferedReader br =
            new BufferedReader(new FileReader("leaderboard.txt"))) {

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (data.length == 2) {
                scores.add(data);
            }
        }
        scores.sort((a,b) ->
            Integer.parseInt(b[1])- Integer.parseInt(a[1]));

        int rank = 1;
        for(String[] data : scores){
                sb.append(rank++)
                  .append(". ")
                  .append(data[0])
                  .append(" - ")
                  .append(data[1])
                  .append("\n");
            }

    } catch (IOException e) {
        sb.append("No scores available.");
    }

    area.setText(sb.toString());

    frame.add(new JScrollPane(area));
    frame.setVisible(true);
}
    }
