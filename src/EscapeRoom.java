import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {

    static JLabel questionLabel, narrationLabel;
    static JRadioButton Option1, Option2, Option3, Option4;
    static JButton nextButton1, backButton, nextButton2, nextButton3;

    public static void main(String[] args) {
        EscapeRoom();

    }
    public static void EscapeRoom(){
        JFrame window = new JFrame("Escape Room");
        JPanel panel = new JPanel();
        ButtonGroup radios = new ButtonGroup();


        nextButton1 = new JButton("Begin");
        nextButton2 = new JButton("Next");
        nextButton3 = new JButton("Next");
        backButton = new JButton("Back");

        Option1 = new JRadioButton("Search for a key");
        Option2 = new JRadioButton("Attempt to open the door now");
        Option3 = new JRadioButton("open the chest");
        Option4 = new JRadioButton("new option2");

        questionLabel = new JLabel("Click begin to start the first task.");
        narrationLabel = new JLabel("You've found a key! You walk over and open the door, on to the next room!");

        window.setSize(600, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        nextButton1.addActionListener(new Next1ButtonListener());
        nextButton2.addActionListener(new Next2ButtonListener());
        nextButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        backButton.addActionListener(new BackButtonListener());

        radios.add(Option1);
        radios.add(Option2);

        panel.add(nextButton1);
        panel.add(nextButton2);
        panel.add(nextButton3);
        panel.add(questionLabel);
        panel.add(narrationLabel);
        panel.add(Option1);
        panel.add(Option2);
        panel.add(Option3);
        panel.add(Option4);
        panel.add(backButton);
        panel.setLayout(null);

        questionLabel.setBounds(100,100,500,100);
        narrationLabel.setBounds(100,200,500,100);
        questionLabel.setLocation(150,10);
        narrationLabel.setLocation(150,80);

        Option1.setBounds(100,100,500,30);
        Option2.setBounds(100,100,500,30);
        Option3.setBounds(100,100,500,30);
        Option4.setBounds(100,100,500,30);
        Option1.setLocation(150,100);
        Option2.setLocation(150,150);
        Option3.setLocation(150,100);
        Option4.setLocation(150,150);
        nextButton1.setLocation(250,400);
        nextButton1.setSize(100,50);
        backButton.setLocation(250,400);
        backButton.setSize(100,50);
        nextButton2.setLocation(250,400);
        nextButton2.setSize(100,50);
        nextButton3.setLocation(250,400);
        nextButton3.setSize(100,50);

        narrationLabel.setVisible(false);
        Option1.setVisible(false);
        Option2.setVisible(false);
        Option3.setVisible(false);
        Option4.setVisible(false);
        backButton.setVisible(false);
        nextButton2.setVisible(false);
        nextButton3.setVisible(false);

        Option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option1.isSelected()){
                    Option1.setVisible(false);
                    Option2.setVisible(false);
                    questionLabel.setText("You turn around to find a desk and begin searching");
                    narrationLabel.setVisible(true);
                    nextButton1.setVisible(false);
                    backButton.setVisible(false);
                    nextButton2.setVisible(true);
                }
            }
        });
        Option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option2.isSelected()) {
                    Option1.setVisible(false);
                    Option2.setVisible(false);
                    questionLabel.setText("You'll need to find a key");
                    nextButton1.setVisible(false);
                    backButton.setVisible(true);

                }
            }
        });
        Option3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option3.isSelected()) {
                    questionLabel.setText("You open the chest and find a hammer and a piece of paper with a combination on it,");
                    narrationLabel.setText("what will you do?");
                    Option4.setVisible(true);
                    //Option5.setVisible(true);

                }
            }
        });
        Option4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option4.isSelected()) {


                }
            }
        });
        /*Option5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option5.isSelected()) {


                }
            }
        });*/

        window.add(panel);

        window.setVisible(true);
    }

    private static class Next1ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            nextButton1.setText("Next");
            questionLabel.setText("You need to open the door ahead, what will you do?");
            Option1.setVisible(true);
            Option2.setVisible(true);
        }
    }
    private static class BackButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            backButton.setText("Back");
            questionLabel.setText("You need to open the door ahead, what will you do?");
            Option1.setVisible(true);
            Option2.setVisible(true);
            backButton.setVisible(false);
            nextButton1.setVisible(true);
        }
    }
    private static class Next2ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            nextButton2.setText("Next");
            questionLabel.setLocation(75,10);
            questionLabel.setText("Behind the door is a smaller room with a combination locked door, a chest against the");
            narrationLabel.setText("left wall, and a window on the right wall.");
            narrationLabel.setLocation(75,30);
            Option3.setVisible(true);
            Option4.setVisible(false);
            nextButton2.setVisible(false);
            nextButton3.setVisible(true);
        }
    }
}