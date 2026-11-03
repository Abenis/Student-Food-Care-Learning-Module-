import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements SaveData {
    private User user; 
    @Override
    public void saveData (String username, int score) {

        try {
            user = new User(username);
            FileWriter writer = new FileWriter ("leaderboard.txt", true);
            writer.write(user.getUsername() + ": " + score + "\n");
            writer.close();
            System.out.println("Score saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the score.");
        }
    }
}