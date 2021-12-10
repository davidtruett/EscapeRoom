import javax.swing.*;

public class EscapeRoom {

    JPanel panel;
    JButton push, pull;
    JLabel question1;

    public static void main(String[] args) {
        new EscapeRoom();
    }

    public EscapeRoom() {
        JFrame frame = new JFrame("Escape Room!");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        question1 = new JLabel("\nYou begin in a small room, with only one door. This door has no " +
                "\nhandle, it seems to be a push/pull door, what will you do?");

        push = new JButton("Push");
        pull = new JButton("Pull");

        question1.setBounds(50,40,350,50);
        push.setBounds(100,100,200,30);
        pull.setBounds(100,140,200,30);


        panel.add(question1);
        panel.add(push);
        panel.add(pull);



        panel.setLayout(null);

        frame.add(panel);
        frame.setVisible(true);


    }
}