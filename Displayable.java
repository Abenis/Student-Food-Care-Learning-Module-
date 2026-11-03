
import javax.swing.JPanel;

/**
 * ========================================================
 * PROJECT: StudentFoodCare (SDG 2: Zero Hunger)
 * MODULE ROLE: Quiz Engine Core
 * CREATED BY: Anastasia Jyntang Mau (103315)
 * ========================================================
 */

public interface Displayable {
    // Abstract contract method to draw visual components onto a target panel
    void displayQuestion(JPanel panel);
}