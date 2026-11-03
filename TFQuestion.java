
import java.awt.*;
import javax.swing.*;

/**
 * ========================================================
 * PROJECT: StudentFoodCare (SDG 2: Zero Hunger)
 * MODULE ROLE: Quiz Engine Core
 * CREATED BY: Anastasia Jyntang Mau (103315)
 * ========================================================
 */
public class TFQuestion extends Question {

    public TFQuestion(String textPrompt, String correctAns) {
        super(textPrompt, correctAns);
    }

    @Override
    public void displayQuestion(JPanel targetPanel) {
        targetPanel.setLayout(new BoxLayout(targetPanel, BoxLayout.Y_AXIS));

        JLabel questionHeading = new JLabel("<html><body style='width: 250px;'>" + questionText + "</body></html>");
        questionHeading.setFont(new Font("SansSerif", Font.BOLD, 14));
        questionHeading.setAlignmentX(Component.LEFT_ALIGNMENT);
        targetPanel.add(questionHeading);
        targetPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        ButtonGroup choiceGroup = new ButtonGroup();
        
        JRadioButton yesOption = new JRadioButton("True");
        yesOption.setActionCommand("True");
        yesOption.setFont(new Font("SansSerif", Font.PLAIN, 13));
        yesOption.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JRadioButton noOption = new JRadioButton("False");
        noOption.setActionCommand("False");
        noOption.setFont(new Font("SansSerif", Font.PLAIN, 13));
        noOption.setAlignmentX(Component.LEFT_ALIGNMENT);

        choiceGroup.add(yesOption);
        choiceGroup.add(noOption);
        
        targetPanel.add(yesOption);
        targetPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        targetPanel.add(noOption);

        targetPanel.putClientProperty("buttonGroup", choiceGroup);
    }
}