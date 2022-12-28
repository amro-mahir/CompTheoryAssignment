import javax.swing.*;
import java.awt.*;

public class Home {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        JLabel titleLabel = new JLabel("TIC2151 Theory of Computation");
        titleLabel.setBounds(0,0,500,20);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(titleLabel);

        JLabel tutLabel = new JLabel("Tut no.");
        tutLabel.setBounds(0,20,500,20);
        tutLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(tutLabel);

        JLabel groupLabel = new JLabel("Group No.");
        groupLabel.setBounds(0,40,500,20);
        groupLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(groupLabel);

        JLabel membersLabel = new JLabel("Group members, name, photo, and ID");
        membersLabel.setBounds(0,60,500,20);
        membersLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(membersLabel);

        JPanel imageOne = new JPanel();
        imageOne.setBorder(BorderFactory.createLineBorder(Color.RED));
        imageOne.setBounds(10,120,110,110);
        mainPanel.add(imageOne);

        JLabel nameOne = new JLabel("Name 1");
        nameOne.setBounds(10,230,110,20);
        nameOne.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(nameOne);

        JLabel idOne = new JLabel("xxxxxxxxxx");
        idOne.setBounds(10,250,110,20);
        idOne.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(idOne);

        JLabel leaderLabel = new JLabel("Leader");
        leaderLabel.setBounds(10,270,110,20);
        leaderLabel.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(leaderLabel);

        JPanel imageTwo = new JPanel();
        imageTwo.setBorder(BorderFactory.createLineBorder(Color.RED));
        imageTwo.setBounds(190,120,110,110);
        mainPanel.add(imageTwo);

        JLabel nameTwo = new JLabel("Name 2");
        nameTwo.setBounds(190,230,110,20);
        nameTwo.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(nameTwo);

        JLabel idTwo = new JLabel("xxxxxxxxxx");
        idTwo.setBounds(190,250,110,20);
        idTwo.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(idTwo);

        JPanel imageThree = new JPanel();
        imageThree.setBorder(BorderFactory.createLineBorder(Color.RED));
        imageThree.setBounds(360,120,110,110);
        mainPanel.add(imageThree);

        JLabel nameThree = new JLabel("Name 3");
        nameThree.setBounds(360,230,110,20);
        nameThree.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(nameThree);

        JLabel idThree = new JLabel("xxxxxxxxxx");
        idThree.setBounds(360,250,110,20);
        idThree.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(idThree);

        JLabel contributionOne = new JLabel("Member 1: xx%");
        contributionOne.setBounds(50,300,200,20);
        contributionOne.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(contributionOne);

        JLabel contributionTwo = new JLabel("Member 2: xx%");
        contributionTwo.setBounds(50,320,200,20);
        contributionTwo.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(contributionTwo);

        JLabel contributionThree = new JLabel("Member 3: xx%");
        contributionThree.setBounds(50,340,200,20);
        contributionThree.setHorizontalAlignment(JLabel.LEFT);
        mainPanel.add(contributionThree);

    }
}
