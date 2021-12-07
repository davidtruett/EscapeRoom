import javax.swing.*;

public class EscapeRoom {
    static String displayQuestion = "";
    JPanel panel;
    JButton push, pull;
    JLabel question1;

    public static void main(String[] args) {
        new EscapeRoom();
    }

    public EscapeRoom() {
        JFrame frame = new JFrame("Escape Room!");
        frame.setSize(400,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        push = new JButton("Push");
        pull = new JButton("Pull");
        question1 = new JLabel("\nYou begin in a small room, with only one door. " +
                "\nThis door has no handle, it seems to be a push/pull door, what will you do?");

        push.setBounds(100,10,200,30);
        pull.setBounds(100,40,200,30);
        question1.setBounds(200,50,200,50);

        panel.add(question1);
        panel.add(push);
        panel.add(pull);



        panel.setLayout(null);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void getUserAnswer(){
        //userAnswer = input(displayProblem);
    }
    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

}