//giveReward interface that defines the methods for providing rewards based on the score
//This interface is implemented by the RewardSystem class to provide motivational messages, badges, and stars based on the score achieved by the user
//Created by: Sharifah Nur Farahin Binti Wan Bujang (106292)

public interface giveReward {
    String getMotivationalMessage(int score);
    String getBadge(int score);
    String getStars(int score);
}