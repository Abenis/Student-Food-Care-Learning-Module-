
import java.awt.*;
import javax.swing.*;

/**
 * ========================================================
 * PROJECT: StudentFoodCare (SDG 2: Zero Hunger)
 * MODULE ROLE: Quiz Engine Core
 * CREATED BY: Anastasia Jyntang Mau (103315)
 * ========================================================
 */
public class MCQQuestion extends Question {
    private String[] options;

    public MCQQuestion(String questionText, String[] options, String correctAnswer) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    @Override
    public void displayQuestion(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel qLabel = new JLabel("<html><body style='width: 250px;'>" + questionText + "</body></html>");
        qLabel.setFont(new Font("Arial", Font.BOLD, 14));
        qLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(qLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 15))); 

        ButtonGroup group = new ButtonGroup();

        for (String option : options) {
            JRadioButton rb = new JRadioButton(option);
            rb.setActionCommand(option.substring(0, 1)); 
            rb.setFont(new Font("Arial", Font.PLAIN, 13));
            rb.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            group.add(rb);
            panel.add(rb);
            panel.add(Box.createRigidArea(new Dimension(0, 8))); 
        }
        
        panel.putClientProperty("buttonGroup", group);
    }
}