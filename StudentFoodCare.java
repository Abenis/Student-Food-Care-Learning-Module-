//Main class for Student Food Care application
//This class creates the main menu for the application and allows users to access the learning module and quiz module
//created by: Hanis 
//Testor: Anastasia, Yvea, Farahin
import javax.swing.*;
import StudentFoodCare.QuizModule;

public class StudentFoodCare extends JFrame{
    private JFrame menu;
    private User user;
    private JButton btnEnter, btnLearn, btnQuiz, btnExit;

public StudentFoodCare() {
     //interface of Student Food Care Main Menu
    JFrame menu = new JFrame("Student Food Care");
    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    menu.setSize(360,460);    
    
    JTextField txtUsername = new JTextField(15);
    JLabel lblUsername = new JLabel("Please enter your name:");
    //buttons for the main menu
    //unable to click the buttons until the user clicks the enter button
    btnLearn = new JButton("Learning Module");
    btnLearn.setEnabled(false);
    btnQuiz = new JButton("Quiz Module");
    btnQuiz.setEnabled(false);
    btnExit = new JButton("Exit");
    btnExit.setEnabled(false);
    btnEnter = new JButton("Enter");

    btnEnter.addActionListener(e -> {
    String username = txtUsername.getText().trim();
    user = new User(username);
    if (user.getUsername()!= null && !user.getUsername().isEmpty()) {
    lblUsername.setText("Hello, " + user.getUsername() + ", Welcome to Student Food Care.");
    }
    else {
    lblUsername.setText("Hello, Welcome to Student Food Care.");
    }

    btnLearn.setEnabled(true);
    btnQuiz.setEnabled(true);
    btnExit.setEnabled(true);

    txtUsername.setEnabled(false);
    btnEnter.setEnabled(false);
    });
    //button to open the learning Module
    btnLearn.addActionListener(e -> {
        LearningModule module = new LearningModule();
        module.setVisible(true);
    });
    //button derect to quiz
    btnQuiz.addActionListener(e ->{
        QuizModule quiz = new QuizModule();
        quiz.setVisible(true);
    }); 

    btnExit.addActionListener(e -> {
        System.exit(0);
    });
    
    menu.setLayout(new BoxLayout(menu.getContentPane(), BoxLayout.Y_AXIS));
    menu.add(lblUsername);
    menu.add(txtUsername);
    menu.add(btnEnter);
    menu.add(btnLearn);
    menu.add(btnQuiz);
    menu.add(btnExit);
    //button to open the quiz module
    menu.setVisible(true);
}
 public static void main(String[] args) {
    StudentFoodCare menu = new StudentFoodCare();
}
}

