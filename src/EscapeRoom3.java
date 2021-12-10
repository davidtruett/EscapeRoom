import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom3 {

    static JLabel questionLabel;
    static JRadioButton Option1, Option2;
    static JButton nextButton;

    public static void main(String[] args) {
        EscapeRoom3();

    }
    public static void EscapeRoom3(){
        JFrame window = new JFrame("Escape Room");
        JPanel panel = new JPanel();
        ButtonGroup radios = new ButtonGroup();


        nextButton = new JButton("Begin");
        Option1 = new JRadioButton("Search for a key");
        Option2 = new JRadioButton("Attempt to open the door now");
        questionLabel = new JLabel("Click begin to start the first task.");

        window.setSize(600, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        nextButton.addActionListener(new ButtonListener());

        radios.add(Option1);
        radios.add(Option2);

        panel.add(nextButton);
        panel.add(questionLabel);
        panel.add(Option1);
        panel.add(Option2);
        panel.setLayout(null);

        questionLabel.setBounds(100,100,500,100);
        Option1.setBounds(100,100,500,30);
        Option2.setBounds(100,100,500,30);
        questionLabel.setLocation(150,10);
        Option1.setLocation(150,100);
        Option2.setLocation(150,150);
        nextButton.setLocation(250,400);
        nextButton.setSize(100,50);

        Option1.setVisible(false);
        Option2.setVisible(false);

        Option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option1.isSelected()){
                    questionLabel.setText("words");
                }
            }
        });
        Option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Option2.isSelected()) {
                    questionLabel.setText("other words");
                }
            }
        });

        window.add(panel);

        window.setVisible(true);
    }

    private static class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            nextButton.setText("Next");
            questionLabel.setText("You need to open the door ahead, what will you do?");
            Option1.setVisible(true);
            Option2.setVisible(true);
        }
    }
    public static actionListener{

    }
}