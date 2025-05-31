//will handle the logic of the game

import java.util.Random;

public class RockPaperScissor
{
    public static final String[] computerChoices= {"Rock", "Paper", "Scissors"};

    // property of the class computerChoice
    private String computerChoice;
    
    //Store the scores
    private int computerScore, playerScore;

    public String getComputerChoice() {
        return computerChoice;
    }
    public int getComputerScore() {
        return computerScore;
    }
    public int getPlayerScore() {
        return playerScore;
    }
    //generate a random number to choose a random choice
    private Random random;

    //initialize random obj
    public RockPaperScissor()
    {
        random= new Random();
    }
    //call this to start playing the game
    //returns the result of the game
    public String playRockPaperScissor(String playerChoice)
    {
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock"))
        {
            if(playerChoice.equals("Paper"))
            {
                result= "Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Scissors"))
            {
                result="Computer wins";
                computerScore++;
            }
            else
            {
                result="Draw";
            }
        }
        else if(computerChoice.equals("Paper"))
        {
            if(playerChoice.equals("Scissors"))
            {
                result= "Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Rock"))
            {
                result="Computer wins";
                computerScore++;
            }
            else
            {
                result="Draw";
            }
        }
        else
        {
            if(playerChoice.equals("Rock"))
            {
                result= "Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Paper"))
            {
                result="Computer wins";
                computerScore++;
            }
            else
            {
                result="Draw";
            }
        }
        return result;
    }
}
