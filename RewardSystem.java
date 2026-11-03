//RewardSystem class that implements the giveReward interface to provide rewards based on the score
//This class provides motivational messages, badges, and stars based on the score achieved by the user
//Created by: Sharifah Nur Farahin Binti Wan Bujang (106292)

public class RewardSystem implements giveReward{
    
    @Override
    public String getMotivationalMessage (int score) {
        if (score >= 80) 
            return "Outstanding!";
        else if (score >= 60)
            return "That's good!";
        else if (score >= 40)
            return "Good try!";
        else if (score >= 20)
            return "You can do better!";
        else 
            return "Don't give up!";
    }

    @Override
    public String getBadge (int score) {
        if (score >= 80)
            return "Gold Badge";
        else if (score >= 60)
            return "Silver Badge";
        else if (score >= 40)
            return "Bronze Badge";
        else if (score >= 20)
            return "Keep Learning Badge";
        else
            return "No Badge";
    }

    @Override 
    public String getStars (int score) {
        if (score >= 80)
            return "⭐⭐⭐⭐⭐";
        else if (score >= 60)
            return "⭐⭐⭐⭐";
        else if (score >= 40)
            return "⭐⭐⭐";
        else if (score >= 20)
            return "⭐⭐";
        else
            return "⭐";
    }
}