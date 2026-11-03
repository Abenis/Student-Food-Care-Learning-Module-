
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class QuizModule extends JFrame {
    private User user;
    private ArrayList<Question> quizItems;
    private int activeItemIndex = 0;
    private int correctCount = 0;
    private LeaderBoard leaderBoard;//link with LeaderBoard
    private ScoreManager scoreManager; //link with scoreManager
    private giveReward rewardSystem; //link with GiveReward

    private JPanel centerDisplayPanel;
    private JButton submitActionButton, btnLeaderBoard, btnSave;
    private JLabel trackingProgressLabel;

    public QuizModule() {
        setTitle("StudentFoodCare Quiz");
        setSize(360, 640); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        quizItems = new ArrayList<>();
        leaderBoard = new LeaderBoard();
        scoreManager = new ScoreManager();
        rewardSystem = new RewardSystem();
        loadQuestions(); 

        JPanel topBannerPanel = new JPanel();
        topBannerPanel.setBackground(new Color(225, 166, 40)); 
        topBannerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel mainHeadingLabel = new JLabel("SDG 2: Zero Hunger Challenge");
        mainHeadingLabel.setForeground(Color.WHITE);
        mainHeadingLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        topBannerPanel.add(mainHeadingLabel);
        add(topBannerPanel, BorderLayout.NORTH);

        centerDisplayPanel = new JPanel();
        centerDisplayPanel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        add(centerDisplayPanel, BorderLayout.CENTER);

        JPanel controlFooterPanel = new JPanel(new BorderLayout());
        controlFooterPanel.setBorder(BorderFactory.createEmptyBorder(10, 25, 20, 25));
        
        trackingProgressLabel = new JLabel("Question 1 of 20", SwingConstants.CENTER);
        trackingProgressLabel.setFont(new Font("SansSerif", Font.PLAIN, 13));
        trackingProgressLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        
        submitActionButton = new JButton("Submit Answer");
        submitActionButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        submitActionButton.setPreferredSize(new Dimension(0, 45));
        submitActionButton.setFocusPainted(false);

        btnSave = new JButton("Save Score");
        submitActionButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        submitActionButton.setPreferredSize(new Dimension(0, 45));
        btnSave.addActionListener(e -> {
            leaderBoard.saveData(user.getUsername(), correctCount);
            JOptionPane.showMessageDialog(
            this,
            "Score saved successfully!"
            );
        });
        btnSave.setEnabled(false);

        btnLeaderBoard = new JButton("View Leaderboard");
        btnLeaderBoard.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnLeaderBoard.setPreferredSize(new Dimension(0, 45));
        btnLeaderBoard.addActionListener(e -> {
            leaderBoard.displayLeaderBoard(); 
        });
        submitActionButton.setFocusPainted(false);
        btnLeaderBoard.setEnabled(false);

        controlFooterPanel.add(trackingProgressLabel, BorderLayout.NORTH);
        controlFooterPanel.add(submitActionButton, BorderLayout.CENTER);
        add(controlFooterPanel, BorderLayout.SOUTH);
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 0, 5));

        buttonPanel.add(btnSave);
        buttonPanel.add(btnLeaderBoard);

        controlFooterPanel.add(trackingProgressLabel, BorderLayout.NORTH);
        controlFooterPanel.add(submitActionButton, BorderLayout.CENTER);
        controlFooterPanel.add(buttonPanel, BorderLayout.SOUTH);

        String username = JOptionPane.showInputDialog("Enter your name:");
        user = new User(username); //input username for leaderboard
        
        displayCurrentQuestion();

        submitActionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswerSubmission();
            }
        });
    }

    private void loadQuestions() {
        // 10 MULTIPLE-CHOICE QUESTIONS (MCQ)
        quizItems.add(new MCQQuestion("What is the primary objective of UN SDG 2?", new String[]{"A. Achieve Zero Hunger", "B. Quality Education", "C. Clean Water", "D. Climate Action"}, "A"));
        quizItems.add(new MCQQuestion("What campus concern does 'StudentFoodCare' target?", new String[]{"A. Parking availability", "B. Student food insecurity", "C. Library book quantity", "D. High-speed WiFi"}, "B"));
        quizItems.add(new MCQQuestion("Which demographic is highly vulnerable to skipping meals in universities?", new String[]{"A. Part-time professors", "B. B40 income tier students", "C. Local alumni", "D. Campus security staff"}, "B"));
        quizItems.add(new MCQQuestion("How can university administrations directly support StudentFoodCare?", new String[]{"A. Increasing tuition fees", "B. Establishing local campus food banks", "C. Closing cafeterias early", "D. Reducing hostel capacities"}, "B"));
        quizItems.add(new MCQQuestion("What is a direct health consequence of prolonged student malnutrition?", new String[]{"A. Improved memory retention", "B. Chronic cognitive fatigue", "C. Heightened athletic agility", "D. Balanced sleep cycles"}, "B"));
        quizItems.add(new MCQQuestion("What action helps minimize food waste in dining halls?", new String[]{"A. Throwing away surplus meals", "B. Leftover food redirection tracking", "C. Serving oversized portions", "D. Banning composting"}, "B"));
        quizItems.add(new MCQQuestion("Which structural solution offers sustainable aid to student nutrition?", new String[]{"A. Vending machines only", "B. Subsidized healthy meal vouchers", "C. Selling energy drinks", "D. Mandatory fasting programs"}, "B"));
        quizItems.add(new MCQQuestion("Malnutrition on campus directly correlates to:", new String[]{"A. Exceptional GPA growth", "B. Declining academic performance", "C. Decreased drop-out statistics", "D. Perfect attendance rates"}, "B"));
        quizItems.add(new MCQQuestion("Sharing extra groceries through student pantries is an act of:", new String[]{"A. Institutional commercialism", "B. Community-led food security", "C. Corporate advertising", "D. Agricultural production"}, "B"));
        quizItems.add(new MCQQuestion("To make food security sustainable, we must prioritize:", new String[]{"A. Expensive imported luxury food", "B. Nutritional literacy & access", "C. Processed sugar distributions", "D. Single-use plastic packaging"}, "B"));

        // 10 TRUE / FALSE QUESTIONS (TF)
        quizItems.add(new TFQuestion("SDG 2 aims to eliminate all forms of malnutrition by 2030.", "True"));
        quizItems.add(new TFQuestion("Food insecurity among university students is a myth and doesn't happen in Malaysia.", "False"));
        quizItems.add(new TFQuestion("The StudentFoodCare framework deals exclusively with clean energy production.", "False"));
        quizItems.add(new TFQuestion("Skipping meals due to financial constraints frequently harms student GPAs.", "True"));
        quizItems.add(new TFQuestion("A basic text file can be safely used to log user scores over runs.", "True"));
        quizItems.add(new TFQuestion("Malnutrition includes both undernutrition and obesity from low-quality diets.", "True"));
        quizItems.add(new TFQuestion("Setting up a crowd-sourced item cabinet on campus violates basic SDG 2 principles.", "False"));
        quizItems.add(new TFQuestion("Sustainable agriculture involves preserving clean water tables while growing food crops.", "True"));
        quizItems.add(new TFQuestion("University student clubs are incapable of driving localized hunger relief programs.", "False"));
        quizItems.add(new TFQuestion("Achieving Zero Hunger directly assists in progressing other SDGs like Good Health.", "True"));
    }

    private void displayCurrentQuestion() {
        centerDisplayPanel.removeAll(); 
        Question selectedQuestion = quizItems.get(activeItemIndex);
        
        selectedQuestion.displayQuestion(centerDisplayPanel);
        
        trackingProgressLabel.setText("Question " + (activeItemIndex + 1) + " of " + quizItems.size());
        centerDisplayPanel.revalidate();
        centerDisplayPanel.repaint();
    }

    private void handleAnswerSubmission() {
        Question currentQuestion = quizItems.get(activeItemIndex);
        ButtonGroup radioGroup = (ButtonGroup) centerDisplayPanel.getClientProperty("buttonGroup");

        if (radioGroup == null || radioGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Please select an answer before continuing!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String chosenToken = radioGroup.getSelection().getActionCommand();
        if (currentQuestion.checkAnswer(chosenToken)) {
            correctCount++;
        }

        activeItemIndex++;

        if (activeItemIndex < quizItems.size()) {
            displayCurrentQuestion();
        } else {
            renderFinalResults();
        }
    }

    private void renderFinalResults() {
        centerDisplayPanel.removeAll();
        submitActionButton.setEnabled(false);
        trackingProgressLabel.setText("Quiz Finished!");

        //Sent score to Score Manager
        scoreManager.setScore(correctCount);

        double percentage = scoreManager.calcPercentage(quizItems.size());
        int scorePercentage = (int) percentage;
        // Reward system
        String message = rewardSystem.getMotivationalMessage(scorePercentage);
        String badge = rewardSystem.getBadge(scorePercentage);
        String stars = rewardSystem.getStars(scorePercentage);
        
        JOptionPane.showMessageDialog(this,
        "Score: " + correctCount +
        "\nPercentage: " + percentage +
        "\n" + message +
        "\nBadge: " + badge +
        "\nStars: " + stars
        );
        leaderBoard.saveData(user.getUsername(), correctCount);
        btnLeaderBoard.setEnabled(true);
        btnSave.setEnabled(true);
        centerDisplayPanel.revalidate();
        centerDisplayPanel.repaint();

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new QuizModule().setVisible(true);
        });
    }
}