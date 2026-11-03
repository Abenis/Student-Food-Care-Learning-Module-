

/**
 * ========================================================
 * PROJECT: StudentFoodCare (SDG 2: Zero Hunger)
 * MODULE ROLE: Quiz Engine Core
 * CREATED BY: Anastasia Jyntang Mau (103315)
 * ========================================================
 */

public abstract class Question implements Displayable {
    protected String questionText;
    protected String correctAnswer;

    // Default setup
    public Question() {
        this.questionText = "Default Question Text?";
        this.correctAnswer = "";
    }

    // Parameterized setup
    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    // Standard baseline validation method
    public boolean checkAnswer(String userAnswer) {
        return this.correctAnswer.equalsIgnoreCase(userAnswer.trim());
    }
}