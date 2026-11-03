/*
 * Project: StudentFoodCare
 * Class: LearningModule
 *
 * Creator: Yvea Grace (106760)
 * Tester: Hanis Syazani, Anastasia Jyntang, Nur Farahin
 */
import java.awt.*;
import java.net.URI;
import javax.swing.*;

// Define the Learnable interface
interface Learnable {
    void nextPage();
    void previousPage();
    void displayContent();
}

public class LearningModule extends JFrame implements Learnable {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public LearningModule() {
        setTitle("StudentFoodCare - Learning Module");
        setSize(430, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        mainPanel.add(createPage1(), "Page1");
        mainPanel.add(createPage2(), "Page2");
        mainPanel.add(createPage3(), "Page3");
        mainPanel.add(createPage4(), "Page4");
        mainPanel.add(createPage5(), "Page5");
        mainPanel.add(createPage6(), "Page6");
        mainPanel.add(createPage7(), "Page7");
        mainPanel.add(createPage8(), "Page8");
        mainPanel.add(createPage9(), "Page9");
        mainPanel.add(createPage10(), "Page10");
        
        add(mainPanel);
        setVisible(true);
    }

    // ... (rest of your methods remain the same)

    //=================PAGE 1=================
    private JPanel createPage1() {

    JPanel panel = new JPanel(new BorderLayout());

    JLabel title = new JLabel(
    "<html><center>"
    + "What are the Sustainable Development Goals,<br>"
    + "and What is Zero Hunger?"
    + "</center></html>",
    SwingConstants.CENTER
    );

    title.setFont(new Font("SansSerif", Font.BOLD, 17));
    title.setForeground(new Color(0,102,0));
    title.setOpaque(true);
    title.setBackground(new Color(255,215,0));
    title.setBorder(
    BorderFactory.createEmptyBorder(20,10,20,10)
    );

    JTextArea content = new JTextArea();

    content.setText(
        "Sustainable Development Goals are a program "
        + "created by the United Nations in the mission "
        + "to spread awareness of the global crisis. "
        + "SDGs create an emergency call for action by "
        + "all countries. There are 17 goals that the "
        + "UN has targeted to achieve through this action.\n\n"

        + "Zero Hunger is one of the goals that targets "
        + "ending hunger, securing food for everyone, "
        + "and improving nutrition while promoting "
        + "sustainable agriculture.\n\n"

        + "By 2030, this goal aims to create a world "
        + "that is free from hunger. Therefore, this "
        + "Learning Module called Student Food Care was "
        + "created to focus on students' access to "
        + "sufficient food in educational institutions."
    );

    content.setWrapStyleWord(true);
    content.setLineWrap(true);
    content.setEditable(false);
    content.setFont(new Font("SansSerif", Font.PLAIN, 18));
    content.setMargin(new Insets(15,15,15,15));
    content.setBackground(new Color(245,245,245));

    JScrollPane scrollPane = new JScrollPane(content);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());

    JButton nextBtn = new JButton("Next →");

    nextBtn.setPreferredSize(new Dimension(110,40));
    nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
    nextBtn.setFocusPainted(false);
    nextBtn.setBackground(new Color(34,139,34));
    nextBtn.setForeground(Color.WHITE);

    nextBtn.addActionListener(e -> nextPage());

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    centerPanel.setBackground(new Color(245,245,245));

    centerPanel.add(scrollPane);
    centerPanel.add(Box.createVerticalStrut(20));

    JPanel middleButtonPanel =
        new JPanel(new FlowLayout(FlowLayout.RIGHT,40,0));

    middleButtonPanel.setBackground(new Color(245,245,245));
    middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0,0,180,0)
    );

    middleButtonPanel.add(nextBtn);

    centerPanel.add(middleButtonPanel);

    JLabel pageLabel = new JLabel("Page 1 / 10");
    pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(new Color(245,245,245));

    bottomPanel.add(pageLabel, BorderLayout.WEST);

    panel.add(title, BorderLayout.NORTH);
    panel.add(centerPanel, BorderLayout.CENTER);
    panel.add(bottomPanel, BorderLayout.SOUTH);

    return panel;
}

    //=================PAGE 2=================
    private JPanel createPage2() {

    JPanel panel = new JPanel(new BorderLayout());

    // Title
    JLabel title = new JLabel(
    "<html><center>"
    + "What is the Importance of Zero Hunger,<br>"
    + "and What is its Role in Schools or Institutions?"
    + "</center></html>",
    SwingConstants.CENTER
    );

    title.setFont(new Font("SansSerif", Font.BOLD, 17));
    title.setForeground(new Color(153, 51, 0));
    title.setOpaque(true);
    title.setBackground(new Color(255,204,102));
    title.setBorder(
        BorderFactory.createEmptyBorder(15,10,15,10)
    );

    // Content
    JTextArea content = new JTextArea();

    content.setText(
        "The Zero Hunger goal is important because it "
        + "addresses one of humanity's most basic needs, "
        + "which is access to food.\n\n"

        + "Hunger affects health, learning, and overall "
        + "well-being.\n\n"

        + "In schools and institutions, Zero Hunger plays "
        + "a vital role by ensuring that students have "
        + "access to nutritious meals.\n\n"

        + "This not only supports their physical growth "
        + "but also enhances concentration, academic "
        + "performance, and equal opportunities for success."
    );

    content.setWrapStyleWord(true);
    content.setLineWrap(true);
    content.setEditable(false);
    content.setFont(new Font("SansSerif", Font.PLAIN, 18));
    content.setMargin(new Insets(15,15,15,15));
    content.setBackground(new Color(245,245,245));

    JScrollPane scrollPane = new JScrollPane(content);
    scrollPane.setBorder(
        BorderFactory.createEmptyBorder()
    );

    // Buttons
    JButton prevBtn = new JButton("← Previous");
    JButton nextBtn = new JButton("Next →");

    prevBtn.setPreferredSize(new Dimension(130,40));
    nextBtn.setPreferredSize(new Dimension(110,40));

    prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
    nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

    prevBtn.setFocusPainted(false);
    nextBtn.setFocusPainted(false);

    prevBtn.setBackground(new Color(178,34,34));
    prevBtn.setForeground(Color.WHITE);

    nextBtn.setBackground(new Color(34,139,34));
    nextBtn.setForeground(Color.WHITE);

    prevBtn.addActionListener(e -> previousPage());
    nextBtn.addActionListener(e -> nextPage());

    // Center Panel
    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    centerPanel.setBackground(new Color(245,245,245));

    centerPanel.add(scrollPane);

    // Space after content
    centerPanel.add(Box.createVerticalStrut(20));

    // Button Panel
    JPanel middleButtonPanel = new JPanel(new BorderLayout());
    middleButtonPanel.setBackground(new Color(245,245,245));

    JPanel leftPanel = new JPanel();
    leftPanel.setBackground(new Color(245,245,245));
    leftPanel.add(prevBtn);

    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(new Color(245,245,245));
    rightPanel.add(nextBtn);

    middleButtonPanel.add(leftPanel, BorderLayout.WEST);
    middleButtonPanel.add(rightPanel, BorderLayout.EAST);

    // Same position style as Page 4 & Page 5
    middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0,20,180,20)
    );

    centerPanel.add(middleButtonPanel);

    // Page Number
    JLabel pageLabel = new JLabel("Page 2 / 10");
    pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(new Color(245,245,245));

    bottomPanel.add(pageLabel, BorderLayout.WEST);

    // Add Components
    panel.add(title, BorderLayout.NORTH);
    panel.add(centerPanel, BorderLayout.CENTER);
    panel.add(bottomPanel, BorderLayout.SOUTH);

    return panel;
}

    //=================PAGE 3=================
    private JPanel createPage3() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 248, 220));
        panel.setLayout(new BorderLayout());

        //Title
        JLabel title = new JLabel (
            "How SDG 2 is implemented in Malaysia?" ,
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 17));
        title.setForeground(new Color(0,102,0));
        title.setOpaque(true);
        title.setBackground(new Color(255,215,0));     
        title.setBorder(BorderFactory.createEmptyBorder(15,10,15,10));

        //IMAGE CODE START
        ImageIcon image = new ImageIcon("\"C:\\Users\\user\\OneDrive\\Documents\\lab java\\StudentFoodCare\\images\\sdg2.png\"");

        // Resize image
        Image scaledImage = image.getImage().getScaledInstance(
        100,
        100,
        Image.SCALE_SMOOTH
        );

        // Put image into label
        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create top panel
        JPanel topPanel = new JPanel(new BorderLayout());

        topPanel.setBackground(new Color(255,215,0)); 
        topPanel.setPreferredSize(new Dimension(430,180));

        topPanel.add(title, BorderLayout.NORTH);
        topPanel.add(imageLabel, BorderLayout.CENTER);
        //IMAGE CODE END

        JTextArea content = new JTextArea();

        content.setText(
            "Malaysia supports SDG 2 through food banks, "
            + "student food aid programs, agricultural support, "
            + "and university food pantries.\n\n"

            + "Many universities now provide affordable meals "
            + "and food assistance for students facing financial "
            + "difficulties.\n\n"

            + "These initiatives help reduce hunger and improve "
            + "student well-being."
        );

        content.setWrapStyleWord(true);
        content.setLineWrap(true);
        content.setEditable(false);
        content.setFont(new Font("SansSerif", Font.PLAIN, 18));
        content.setMargin(new Insets(15,15, 15,15)); //add space around text
        content.setBackground(new Color(245, 245, 245));

        //Scroll
        JScrollPane scrollPane = new JScrollPane(content);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        //Next button
        JButton prevBtn = new JButton("← Previous");
        JButton nextBtn = new JButton("Next →");

        prevBtn.setPreferredSize(new Dimension(130,40));
        nextBtn.setPreferredSize(new Dimension(110,40));

        prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

        prevBtn.setFocusPainted(false);
        nextBtn.setFocusPainted(false);

        prevBtn.setBackground(new Color(178,34,34));
        prevBtn.setForeground(Color.WHITE);

        nextBtn.setBackground(new Color(34,139,34));
        nextBtn.setForeground(Color.WHITE);

        prevBtn.addActionListener(e -> previousPage());
        nextBtn.addActionListener(e -> nextPage());

        //CENTER CONTENT 
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245,245,245));

        centerPanel.add(scrollPane);

        //space after text
        centerPanel.add(Box.createVerticalStrut(20));

        //button panel
        JPanel middleButtonPanel = new JPanel(new BorderLayout());
        middleButtonPanel.setBackground(new Color(245,245,245));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(245,245,245));
        leftPanel.add(prevBtn);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(245,245,245));
        rightPanel.add(nextBtn);

        middleButtonPanel.add(leftPanel, BorderLayout.WEST);
        middleButtonPanel.add(rightPanel, BorderLayout.EAST);

        middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0, 20, 180, 20)
        );

        centerPanel.add(middleButtonPanel);

        //PAGE NUMBER 
        JLabel pageLabel = new JLabel("Page 3 / 10");
        pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(new Color(245,245,245));

        bottomPanel.add(pageLabel, BorderLayout.WEST);

        //ADD COMPONENTS
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        return panel;
    }

    //=================PAGE 4=================
    private JPanel createPage4() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel title = new JLabel(
            "Problems Faced by University Students",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 17));
        title.setForeground(new Color(153, 51, 0));
        title.setOpaque(true);
        title.setBackground(new Color(255,204,102));
        title.setBorder(
            BorderFactory.createEmptyBorder(15,10,15,10)
        );

        JTextArea content = new JTextArea();

        content.setText(
            "Many university students struggle with rising "
            + "food prices and limited financial support.\n\n"

            + "Some students skip meals to save money, "
            + "which affects their health and academic "
            + "performance. \n\n"

            + "Food insecurity can increase stress, fatigue, "
            + "and poor concentration during class."
        );

        content.setWrapStyleWord(true);
        content.setLineWrap(true);
        content.setEditable(false);
        content.setFont(new Font("SansSerif", Font.PLAIN, 18));
        content.setMargin(new Insets(15,15,15,15));
        content.setBackground(new Color(245,245,245));
        content.setCaretPosition(0);

        JScrollPane scrollPane = new JScrollPane(content);
        scrollPane.setBorder(
            BorderFactory.createEmptyBorder()
        );
        JButton prevBtn = new JButton("← Previous");
        JButton nextBtn = new JButton("Next →");

        prevBtn.setPreferredSize(new Dimension(130,40));
        nextBtn.setPreferredSize(new Dimension(110,40));

        prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

        prevBtn.addActionListener(e -> previousPage());
        nextBtn.addActionListener(e -> nextPage());

        prevBtn.setFocusPainted(false);

        prevBtn.setBackground(new Color(178,34,34));
        prevBtn.setForeground(Color.WHITE);
        nextBtn.setFocusPainted(false);
        nextBtn.setBackground(new Color(34,139,34));
        nextBtn.setForeground(Color.WHITE);

        JLabel pageLabel = new JLabel("Page 4 / 10");
        pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        
        //CENTER PANEL
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245,245,245));
        centerPanel.add(scrollPane);

        // space after content
        centerPanel.add(Box.createVerticalStrut(20));

        // buttons panel
        JPanel middleButtonPanel = new JPanel(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(245,245,245));
        leftPanel.add(prevBtn);
 
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(245,245,245));
        rightPanel.add(nextBtn);

        middleButtonPanel.add(leftPanel, BorderLayout.WEST);
        middleButtonPanel.add(rightPanel, BorderLayout.EAST);

        middleButtonPanel.setBackground(new Color(245,245,245));

        // move buttons upward
        middleButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 180, 20));

        centerPanel.add(middleButtonPanel);

        //PAGE NUMBER
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(new Color(245,245,245));

        bottomPanel.add(pageLabel, BorderLayout.WEST);

        //ADD COMPONENTS

        panel.add(title, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        return panel;
    }

    //=================PAGE 5=================
    private JPanel createPage5() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel title = new JLabel(
            "How StudentFoodCare Helps?",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 17));
        title.setForeground(new Color(0,102,0));
        title.setOpaque(true);
        title.setBackground(new Color(255,215,130));
        title.setBorder(
            BorderFactory.createEmptyBorder(20,10,20,10)
        );

        JTextArea content = new JTextArea();

        //IMAGE CODE START
        ImageIcon image1 = new ImageIcon("\"C:\\Users\\user\\OneDrive\\Documents\\lab java\\StudentFoodCare\\images\\page5.1.png\"");

        Image scaled1 = image1.getImage().getScaledInstance(
        90,
        90,
        Image.SCALE_SMOOTH
        );

        JLabel label1 = new JLabel(new ImageIcon(scaled1));

        //2ND IMAGE
        ImageIcon image2 = new ImageIcon("\"C:\\Users\\user\\OneDrive\\Documents\\lab java\\StudentFoodCare\\images\\page5.2.png\"");

        Image scaled2 = image2.getImage().getScaledInstance(
        90,
        90,
        Image.SCALE_SMOOTH
        );

        JLabel label2 = new JLabel(new ImageIcon(scaled2));

        //3RD IMAGE
        ImageIcon image3 = new ImageIcon("\"C:\\Users\\user\\OneDrive\\Documents\\lab java\\StudentFoodCare\\images\\page5.3.png\"");

        Image scaled3 = image3.getImage().getScaledInstance(
        90,
        90,
        Image.SCALE_SMOOTH
        );

        JLabel label3 = new JLabel(new ImageIcon(scaled3));

        //Panel for 3 images
        JPanel imagePanel = new JPanel();

        imagePanel.setBackground(new Color(255,248,220));

        imagePanel.add(label1);
        imagePanel.add(label2);
        imagePanel.add(label3);

        JPanel topPanel = new JPanel(new BorderLayout());

        topPanel.setBackground(new Color(220,230,245));
        topPanel.setPreferredSize(new Dimension(430,190));

        topPanel.add(title, BorderLayout.NORTH);
        topPanel.add(imagePanel, BorderLayout.CENTER);

        panel.add(topPanel, BorderLayout.NORTH);

        //IMAGE CODE END

        content.setText(
            "Student FoodCare helps students access affordable "
            + "and nutritious meals on campus,\n\n"

            + "The system connects students with food aid "
            + "programs, campus food banks, and meal support "
            + "services.\n\n"

            + "This platform also spreads awareness about "
            + "food insecurity among university students."
        );

        content.setWrapStyleWord(true);
        content.setLineWrap(true);
        content.setEditable(false);
        content.setFont(new Font("SansSerif", Font.PLAIN, 18));
        content.setMargin(new Insets(15,15,15,15));
        content.setBackground(new Color(245,245,245));

        JScrollPane scrollPane = new JScrollPane(content);

        scrollPane.setBorder(
            BorderFactory.createEmptyBorder()
        );

        JButton prevBtn = new JButton("← Previous");
        JButton nextBtn = new JButton("Next →");

        prevBtn.setPreferredSize(new Dimension(130,40));
        nextBtn.setPreferredSize(new Dimension(110,40));

        prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

        prevBtn.setFocusPainted(false);
        nextBtn.setFocusPainted(false);

        prevBtn.setBackground(new Color(178,34,34));
        prevBtn.setForeground(Color.WHITE);
        nextBtn.setBackground(new Color(34,139,34));
        nextBtn.setForeground(Color.WHITE);

        prevBtn.addActionListener(e -> previousPage());
        nextBtn.addActionListener(e -> nextPage());

        JLabel pageLabel = new JLabel("Page 5 / 10");
        pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        //center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245,245,245));

        centerPanel.add(scrollPane);

        // space after content
        centerPanel.add(Box.createVerticalStrut(20));

        //button panel
        JPanel middleButtonPanel = new JPanel(new BorderLayout());
        middleButtonPanel.setBackground(new Color(245,245,245));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(245,245,245));
        leftPanel.add(prevBtn);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(245,245,245));
        rightPanel.add(nextBtn);

        middleButtonPanel.add(leftPanel, BorderLayout.WEST);
        middleButtonPanel.add(rightPanel, BorderLayout.EAST);

        middleButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 180, 20));
        centerPanel.add(middleButtonPanel);

        //page number
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(new Color(245,245,245));

        bottomPanel.add(pageLabel, BorderLayout.WEST);

        //add components
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        return panel;
    }

    //=================PAGE 6=================
    private JPanel createPage6() {
        JPanel panel = new JPanel(new BorderLayout());

        //Title
        JLabel title = new JLabel(
            "How Students Can Help Reduce Hunger?",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 17));
        title.setForeground(new Color(139,69,19));
        title.setOpaque(true);
        title.setBackground(new Color(240,180,60));
        title.setBorder(
            BorderFactory.createEmptyBorder(15,10,15,10)
        );

        //image
        ImageIcon image = new ImageIcon("\"C:\\Users\\user\\OneDrive\\Documents\\lab java\\StudentFoodCare\\images\\page6.1.png\"");
        Image scaledImage = image.getImage().getScaledInstance(
            300,120, Image.SCALE_SMOOTH
        );

        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Video button(use yt link)
        JButton videoBtn = new JButton("Play Video");

        videoBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        videoBtn.setBackground(new Color(0,102,204));
        videoBtn.setForeground(Color.WHITE);

        videoBtn.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(
                    new URI("https://youtu.be/uU1pzh0S28E?si=WA7IK3Gkd9NdNhUs")
                );
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        //Top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(255,245,204));
        topPanel.setPreferredSize(new Dimension(430,220));

        topPanel.add(title, BorderLayout.NORTH);
        topPanel.add(imageLabel, BorderLayout.CENTER);
        topPanel.add(videoBtn, BorderLayout.SOUTH);

        //Description or Content
        JTextArea content = new JTextArea();

        content.setText(
            "Students can help reduce hunger by supporting "
            + "campus food donation programs and avoiding "
            + "food waste.\n\n"

            + "They can also volunteer at food banks and "
            + "spread awareness about food insecurity "
            + "among university students.\n\n"

            + "Small actions such as sharing extra food "
            + "and helping classmates in need can make "
            + "a positive difference."
        );

        content.setWrapStyleWord(true);
        content.setLineWrap(true);
        content.setEditable(false);
        content.setFont(new Font("SansSerif", Font.PLAIN, 18));
        content.setMargin(new Insets(15,15,15,15));
        content.setBackground(new Color(245,245,245));

        JScrollPane scrollPane = new JScrollPane(content);

        scrollPane.setBorder(
            BorderFactory.createEmptyBorder()
        );

        //Buttons
        JButton prevBtn = new JButton("← Previous");
        JButton nextBtn = new JButton("Next →");

        prevBtn.setPreferredSize(new Dimension(130,40));
        nextBtn.setPreferredSize(new Dimension(110,40));

        prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

        prevBtn.setFocusPainted(false);
        nextBtn.setFocusPainted(false);

        prevBtn.setBackground(new Color(178,34,34));
        prevBtn.setForeground(Color.WHITE);
        nextBtn.setBackground(new Color(34,139,34));
        nextBtn.setForeground(Color.WHITE);

        prevBtn.addActionListener(e -> previousPage());
        nextBtn.addActionListener(e -> nextPage());

        JLabel pageLabel = new JLabel("Page 6 / 10");
        pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        //center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245,245,245));

        centerPanel.add(scrollPane);

        // space after content
        centerPanel.add(Box.createVerticalStrut(20));

        //button panel
        JPanel middleButtonPanel = new JPanel(new BorderLayout());
        middleButtonPanel.setBackground(new Color(245,245,245));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(245,245,245));
        leftPanel.add(prevBtn);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(245,245,245));
        rightPanel.add(nextBtn);

        middleButtonPanel.add(leftPanel, BorderLayout.WEST);
        middleButtonPanel.add(rightPanel, BorderLayout.EAST);

        // move buttons upward
        middleButtonPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 100, 20));

        centerPanel.add(middleButtonPanel);

        //page number
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(new Color(245,245,245));

        bottomPanel.add(pageLabel, BorderLayout.WEST);

        //add components
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        return panel;
    }

    //=================PAGE 7=================
    private JPanel createPage7() {

    JPanel panel = new JPanel(new BorderLayout());

    // Title
    JLabel title = new JLabel(
    "<html><center>"
    + "Establishing Campus Food Banks<br>"
    + "and Pantries"
    + "</center></html>",
    SwingConstants.CENTER
);

    title.setFont(new Font("SansSerif", Font.BOLD, 17));
    title.setForeground(new Color(0,102,0));
    title.setOpaque(true);
    title.setBackground(new Color(255,215,0));
    title.setBorder(
    BorderFactory.createEmptyBorder(20,10,20,10)
);
    // Content
    JTextArea content = new JTextArea();

    content.setText(
        "One effective way to handle food insecurity "
        + "is by setting up physical food banks and "
        + "storage pantries right inside residential "
        + "colleges and faculty buildings.\n\n"

        + "These localized hubs allow students to "
        + "easily grab emergency groceries, dry "
        + "rations, and basic food staples when "
        + "they are short on funds.\n\n"

        + "Through anonymous drop-and-collect "
        + "systems such as 'Lemari Kasih', campus "
        + "communities can donate non-perishable "
        + "food items to help peers in need.\n\n"

        + "This crowd-sourced approach provides a "
        + "dignified and hassle-free safety net "
        + "that directly helps low-income students "
        + "get through difficult weeks without "
        + "skipping meals."
    );

    content.setWrapStyleWord(true);
    content.setLineWrap(true);
    content.setEditable(false);
    content.setFont(new Font("SansSerif", Font.PLAIN, 18));
    content.setMargin(new Insets(15,15,15,15));
    content.setBackground(new Color(245,245,245));

    JScrollPane scrollPane = new JScrollPane(content);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());

    // Buttons
    JButton prevBtn = new JButton("← Previous");
    JButton nextBtn = new JButton("Next →");

    prevBtn.setPreferredSize(new Dimension(130,40));
    nextBtn.setPreferredSize(new Dimension(110,40));

    prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
    nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

    prevBtn.setBackground(new Color(178,34,34));
    prevBtn.setForeground(Color.WHITE);

    nextBtn.setBackground(new Color(34,139,34));
    nextBtn.setForeground(Color.WHITE);

    prevBtn.addActionListener(e -> previousPage());
    nextBtn.addActionListener(e -> nextPage());

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    centerPanel.setBackground(new Color(245,245,245));

    centerPanel.add(scrollPane);
    centerPanel.add(Box.createVerticalStrut(20));

    JPanel middleButtonPanel = new JPanel(new BorderLayout());
    middleButtonPanel.setBackground(new Color(245,245,245));

    JPanel leftPanel = new JPanel();
    leftPanel.setBackground(new Color(245,245,245));
    leftPanel.add(prevBtn);

    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(new Color(245,245,245));
    rightPanel.add(nextBtn);

    middleButtonPanel.add(leftPanel, BorderLayout.WEST);
    middleButtonPanel.add(rightPanel, BorderLayout.EAST);

    middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0,20,180,20)
    );

    centerPanel.add(middleButtonPanel);

    JLabel pageLabel = new JLabel("Page 7 / 10");
    pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(new Color(245,245,245));
    bottomPanel.add(pageLabel, BorderLayout.WEST);

    panel.add(title, BorderLayout.NORTH);
    panel.add(centerPanel, BorderLayout.CENTER);
    panel.add(bottomPanel, BorderLayout.SOUTH);

    return panel;
}

    //=================PAGE 8=================
    private JPanel createPage8() {

    JPanel panel = new JPanel(new BorderLayout());

    // Title
    JLabel title = new JLabel(
        "<html><center>"
        + "Institutional Meal Subsidies<br>"
        + "& Vouchers"
        + "</center></html>",
        SwingConstants.CENTER
    );

    title.setFont(new Font("SansSerif", Font.BOLD, 18));
    title.setForeground(new Color(139,69,19));
    title.setOpaque(true);
    title.setBackground(new Color(242,189,78));
    title.setBorder(
        BorderFactory.createEmptyBorder(20,10,20,10)
    );

    // Content
    JTextArea content = new JTextArea();

    content.setText(
        "University administrations can provide "
        + "structural relief in addition to community-"
        + "run food banks by collaborating directly "
        + "with campus cafeteria vendors to offer "
        + "discounted meal options.\n\n"

        + "Programs such as 'Menu Rahmah' help ensure "
        + "that students have access to affordable "
        + "and nutritious lunch and dinner choices.\n\n"

        + "Additionally, introducing digital food "
        + "vouchers or partnerships with welfare "
        + "organizations such as Tabung Baitulmal "
        + "allows targeted financial aid to reach "
        + "vulnerable students efficiently.\n\n"

        + "Lowering the daily cost of hot meals on "
        + "campus ensures that financial stress does "
        + "not interfere with a student's nutritional "
        + "needs and academic focus."
    );

    content.setWrapStyleWord(true);
    content.setLineWrap(true);
    content.setEditable(false);
    content.setFont(new Font("SansSerif", Font.PLAIN, 18));
    content.setMargin(new Insets(15,15,15,15));
    content.setBackground(new Color(245,245,245));

    JScrollPane scrollPane = new JScrollPane(content);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());

    // Buttons
    JButton prevBtn = new JButton("← Previous");
    JButton nextBtn = new JButton("Next →");

    prevBtn.setPreferredSize(new Dimension(130,40));
    nextBtn.setPreferredSize(new Dimension(110,40));

    prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
    nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

    prevBtn.setBackground(new Color(178,34,34));
    prevBtn.setForeground(Color.WHITE);

    nextBtn.setBackground(new Color(34,139,34));
    nextBtn.setForeground(Color.WHITE);

    prevBtn.addActionListener(e -> previousPage());
    nextBtn.addActionListener(e -> nextPage());

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    centerPanel.setBackground(new Color(245,245,245));

    centerPanel.add(scrollPane);
    centerPanel.add(Box.createVerticalStrut(20));

    JPanel middleButtonPanel = new JPanel(new BorderLayout());
    middleButtonPanel.setBackground(new Color(245,245,245));

    JPanel leftPanel = new JPanel();
    leftPanel.setBackground(new Color(245,245,245));
    leftPanel.add(prevBtn);

    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(new Color(245,245,245));
    rightPanel.add(nextBtn);

    middleButtonPanel.add(leftPanel, BorderLayout.WEST);
    middleButtonPanel.add(rightPanel, BorderLayout.EAST);

    middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0,20,180,20)
    );

    centerPanel.add(middleButtonPanel);

    // Page Number
    JLabel pageLabel = new JLabel("Page 8 / 10");
    pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(new Color(245,245,245));

    bottomPanel.add(pageLabel, BorderLayout.WEST);

    panel.add(title, BorderLayout.NORTH);
    panel.add(centerPanel, BorderLayout.CENTER);
    panel.add(bottomPanel, BorderLayout.SOUTH);

    return panel;
}

    //=================PAGE 9=================
    private JPanel createPage9() {

    JPanel panel = new JPanel(new BorderLayout());

    // ===== TOP PANEL =====
    JPanel topPanel = new JPanel();
    topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
    topPanel.setBackground(new Color(255,215,0));

    JLabel title = new JLabel(
        "Impact of Zero Hunger",
        SwingConstants.CENTER
    );

    title.setFont(new Font("SansSerif", Font.BOLD, 17));
    title.setForeground(new Color(0,102,0));
    title.setAlignmentX(Component.CENTER_ALIGNMENT);
    title.setOpaque(true);
    title.setBackground(new Color(255,215,0));

    // IMAGE
    ImageIcon imageIcon =
    new ImageIcon("\"C:\\Users\\user\\OneDrive\\Documents\\lab java\\StudentFoodCare\\images\\page9.png\"");

    Image image =
    imageIcon.getImage().getScaledInstance(
        250, 150, Image.SCALE_SMOOTH);

    JLabel imageLabel =
        new JLabel(new ImageIcon(image));

    imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

    topPanel.add(Box.createVerticalStrut(15));
    topPanel.add(title);
    topPanel.add(Box.createVerticalStrut(15));
    topPanel.add(imageLabel);
    topPanel.add(Box.createVerticalStrut(15));

    // ===== CONTENT =====
    JTextArea content = new JTextArea();

    content.setText(
        "Achieving Zero Hunger can greatly improve "
        + "students' physical health, mental well-being "
        + "and academic performance.\n\n"

        + "Students who have access to nutritious food "
        + "are more energetic, attentive and productive "
        + "in their studies.\n\n"

        + "Reducing hunger also helps create a more "
        + "inclusive learning environment where students "
        + "have equal opportunities to succeed.\n\n"

        + "In addition, reducing food insecurity helps "
        + "lower stress and anxiety among students.\n\n"

        + "When students do not need to worry about "
        + "where their next meal will come from, they "
        + "can focus more on their studies, personal "
        + "development and campus activities.\n\n"

        + "Zero Hunger also promotes a stronger and "
        + "more caring university community.\n\n"

        + "Food donation programs, food banks and "
        + "support initiatives encourage cooperation "
        + "among students, lecturers, staff and "
        + "organizations.\n\n"

        + "These efforts help ensure that no student "
        + "is left behind because of hunger."
    );

    content.setWrapStyleWord(true);
    content.setLineWrap(true);
    content.setEditable(false);
    content.setFont(new Font("SansSerif", Font.PLAIN, 18));
    content.setMargin(new Insets(15,15,15,15));
    content.setBackground(new Color(245,245,245));

    JScrollPane scrollPane = new JScrollPane(content);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());

    // ===== BUTTONS =====
    JButton prevBtn = new JButton("← Previous");
    JButton nextBtn = new JButton("Next →");

    prevBtn.setPreferredSize(new Dimension(130,40));
    nextBtn.setPreferredSize(new Dimension(110,40));

    prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
    nextBtn.setFont(new Font("SansSerif", Font.BOLD, 16));

    prevBtn.setBackground(new Color(178,34,34));
    prevBtn.setForeground(Color.WHITE);

    nextBtn.setBackground(new Color(34,139,34));
    nextBtn.setForeground(Color.WHITE);

    prevBtn.addActionListener(e -> previousPage());
    nextBtn.addActionListener(e -> nextPage());

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    centerPanel.setBackground(new Color(245,245,245));

    centerPanel.add(scrollPane);
    centerPanel.add(Box.createVerticalStrut(20));

    JPanel middleButtonPanel = new JPanel(new BorderLayout());
    middleButtonPanel.setBackground(new Color(245,245,245));

    JPanel leftPanel = new JPanel();
    leftPanel.setBackground(new Color(245,245,245));
    leftPanel.add(prevBtn);

    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(new Color(245,245,245));
    rightPanel.add(nextBtn);

    middleButtonPanel.add(leftPanel, BorderLayout.WEST);
    middleButtonPanel.add(rightPanel, BorderLayout.EAST);

    middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0,20,180,20)
    );

    centerPanel.add(middleButtonPanel);

    JLabel pageLabel = new JLabel("Page 9 / 10");
    pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(new Color(245,245,245));

    bottomPanel.add(pageLabel, BorderLayout.WEST);

    panel.add(topPanel, BorderLayout.NORTH);
    panel.add(centerPanel, BorderLayout.CENTER);
    panel.add(bottomPanel, BorderLayout.SOUTH);

    return panel;
}

    //=================PAGE 10=================
    private JPanel createPage10() {

    JPanel panel = new JPanel(new BorderLayout());

    // Title
    JLabel title = new JLabel(
        "Conclusions",
        SwingConstants.CENTER
    );

    title.setFont(new Font("SansSerif", Font.BOLD, 17));
    title.setForeground(new Color(139,69,19));
    title.setOpaque(true);
    title.setBackground(new Color(242,189,78));
    title.setBorder(
        BorderFactory.createEmptyBorder(20,10,20,10)
    );

    // Content
    JTextArea content = new JTextArea();

    content.setText(
        "SDG 2: Zero Hunger aims to eliminate hunger "
        + "and ensure everyone has access to safe and "
        + "nutritious food.\n\n"

        + "Although many students still face food "
        + "insecurity, initiatives such as StudentFoodCare "
        + "can help address this issue by connecting "
        + "students with food assistance and raising "
        + "awareness about hunger.\n\n"

        + "By working together, universities and students "
        + "can contribute towards achieving Zero Hunger "
        + "and building a healthier future for all.\n\n"

        + "\"Together, we can make hunger a problem "
        + "of the past.\""
    );

    content.setWrapStyleWord(true);
    content.setLineWrap(true);
    content.setEditable(false);
    content.setFont(new Font("SansSerif", Font.PLAIN, 18));
    content.setMargin(new Insets(15,15,15,15));
    content.setBackground(new Color(245,245,245));

    JScrollPane scrollPane = new JScrollPane(content);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());

    // Previous Button
    JButton prevBtn = new JButton("← Previous");

    prevBtn.setPreferredSize(new Dimension(130,40));
    prevBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
    prevBtn.setFocusPainted(false);
    prevBtn.setBackground(new Color(178,34,34));
    prevBtn.setForeground(Color.WHITE);

    prevBtn.addActionListener(e -> previousPage());

    // Center Panel
    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
    centerPanel.setBackground(new Color(245,245,245));

    centerPanel.add(scrollPane);
    centerPanel.add(Box.createVerticalStrut(20));

    // Button Panel
    JPanel middleButtonPanel = new JPanel(new BorderLayout());
    middleButtonPanel.setBackground(new Color(245,245,245));

    JPanel leftPanel = new JPanel();
    leftPanel.setBackground(new Color(245,245,245));
    leftPanel.add(prevBtn);

    middleButtonPanel.add(leftPanel, BorderLayout.WEST);

    middleButtonPanel.setBorder(
        BorderFactory.createEmptyBorder(0,20,180,20)
    );

    centerPanel.add(middleButtonPanel);

    // Page Number
    JLabel pageLabel = new JLabel("Page 10 / 10");
    pageLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

    JPanel bottomPanel = new JPanel(new BorderLayout());
    bottomPanel.setBackground(new Color(245,245,245));

    bottomPanel.add(pageLabel, BorderLayout.WEST);

    // Add Components
    panel.add(title, BorderLayout.NORTH);
    panel.add(centerPanel, BorderLayout.CENTER);
    panel.add(bottomPanel, BorderLayout.SOUTH);

    return panel;
}

    @Override
    public void nextPage() {
        cardLayout.next(mainPanel);
    }

    @Override
    public void previousPage() {
        cardLayout.previous(mainPanel);
    }

    @Override
    public void displayContent() {
        setVisible(true);
    }

    public static void main(String[] args) {
        LearningModule module = new LearningModule();
        module.displayContent();
    }
}