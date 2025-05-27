import javax.swing.*;

public class App {
    public static void main(String[] args)  {
        //invoke later helps to create GUI in thread safe manner
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                //instantiate a rockpaperscissors Gui
                RockPaperScissorsGui rockpaperscissorsGUI=new RockPaperScissorsGui();

                //display the GUI
                rockpaperscissorsGUI.setVisible(true);
            }
        });
    }
}
