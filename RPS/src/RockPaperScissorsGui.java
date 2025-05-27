import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RockPaperScissorsGui extends JFrame{
    //MAKE THE PLAYER BUTTONS AS GLOBAL CAUSE they can use a single ActionPerformed()
    JButton rockButton,scissorsButton,paperButton;
    JLabel computerChoice;
    public RockPaperScissorsGui()
    {
        //invoke JFrame Constructor and set title
        super("Rock Paper Scissors");

        //set the size of GUI
        setSize(450, 574);

        //set layout to null
        setLayout(null);

        //load GUI at the centre of the screen everytime we open the application
        setLocationRelativeTo(null);

        //add GUI components
        addGUIComponents();
    }

    private void addGUIComponents()
    {
        //create computer score label
        JLabel computerScoreLabel= new JLabel("Computer: 0");

        //set x,y coordinates and height width values
        computerScoreLabel.setBounds(0,43,450,30);

        //set the font ,fontweight,etc
        computerScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));
        
        //place text in center
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //addttoGUI to display the components
        add(computerScoreLabel);

        //create computer choice to display the computers result
        computerChoice= new JLabel("?");
        computerChoice.setBounds(175,118,98,81);
        computerChoice.setFont(new Font("Dialog",Font.PLAIN, 18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);

        //create a black border
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        //create player score label
        JLabel playerScoreLabel=new JLabel("Player:0");
        playerScoreLabel.setBounds(0,317,450,30);
        playerScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        //player buttons

        //rock button
        rockButton= new JButton("Rock");
        rockButton.setBounds(40, 387, 105, 81);
        rockButton.setFont(new Font("Dialog", Font.BOLD, 18));
        add(rockButton);

        //paperButton
        paperButton= new JButton("Paper");
        paperButton.setBounds(165, 387, 105, 81);
        paperButton.setFont(new Font("Dialog", Font.BOLD, 18));
        add(paperButton);

        //scissors Button
        scissorsButton= new JButton("Scissor");
        scissorsButton.setBounds(290, 387, 105, 81);
        scissorsButton.setFont(new Font("Dialog", Font.BOLD, 18));
        add(scissorsButton);

        showDialog("Teest");
    }
    //shows a dialog to display the winner and restart the match
    private void showDialog(String message)
    {
        //Dialog takes in three params object owner, title, modal which block all user input until an action on dialog is done
        JDialog resultDialog=new JDialog(this,"Result",true);
        resultDialog.setSize(227,124);
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultDialog.setResizable(false);

        //message label
        JLabel resultLabel=new JLabel(message);
        resultLabel.setFont(new Font("Dialog",Font.BOLD,18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultDialog.add(resultLabel,BorderLayout.CENTER);

        //try again button
        JButton tryAgainButton= new JButton("Try Again");
        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                computerChoice.setText("?");
                resultDialog.dispose();;
            }
        });
        resultDialog.add(tryAgainButton,BorderLayout.SOUTH);


        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);
    }
}
