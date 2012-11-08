import javax.swing.*; 
import java.util.Scanner; 
import static java.lang.Math.*; 
/**
 * The guts of the rock paper scissor process. 
 *
 */
public class RockPaperScissor
{

    private Player p1; 
    private Player p2; 
    private static String id = "rps"; 
    private static int idNum = 100; 

    public RockPaperScissor()
    {
        String msg = "Welcome to Rock Paper Scissors! \n\n"; 
        msg = msg+"You will be playing against the Rocky Balboa"; 
        JOptionPane.showMessageDialog(null,msg); 
        p1 = new Player(newId());
        p2 = new Player("Rocky", "Balboa", newId()); 
    }

    public void playGame()
    {
        int count = 0; 
        int numPlays; 
        String input = JOptionPane.showInputDialog("How many games would you like to play?"); 
        numPlays = Integer.parseInt(input); 

        while(count < numPlays)// runs everything until count is greater than the number of games wanted to be played(numPlays) by the user. 
        {
            getPlayerChoice();
            setComputerChoice(); 
            playRps(); 
            displayResults(); 
            count ++;
        }
        finalWinner(); 

    }

    private void getPlayerChoice()// takes user input from string format and converts into character. Will repeat until 'r', 'p', or 's' are entered. 
    {
        String input = null; 
        boolean done = false; 
        input = JOptionPane.showInputDialog("Please enter \"r\", \"p\", or \"s\"");
        while(!done)// keeps user guessing until input is correct. 
        {
            input = input.toLowerCase(); 

            char c1 = input.charAt(0);
            if(c1 == 'r' || c1 == 's' ||  c1 == 'p' )
            { p1.setCurPlay(c1); 
                done = true;// user inputted correctly.    
            }
            else
                input = JOptionPane.showInputDialog("Invalid character, please enter \"r,\"\"p,\"\"or s\"");

        }
    }

    private void setComputerChoice()//switch statement working in conjucture with a random number generator that determines what the computer will play. 
    {
        int x = (int)(Math.random()*10)%3; 
        char c1= ' '; 

        switch (x)
        {
            case 0:
            c1 = 'r';
            break; 
            case 1: 
            c1 = 'p'; 
            break; 
            case 2: 
            c1 = 's'; 
            break; 

        }
        p2.setCurPlay(c1); 
    }

    private void playRps()//compares what the computer and the user plays and determines whether it was a tie, win, or loss for both the user and computer. 
    {
        char p1Choice; 
        char p2Choice; 

        p1Choice = p1.getCurPlay();
        p2Choice = p2.getCurPlay(); 

        if((p1Choice == 'r' && p2Choice == 's') || (p1Choice == 's' && p2Choice == 'p') || (p1Choice == 'p' && p2Choice == 'r'))
        {
            p1.addWin(); 
            p2.addLoss(); 
        }
        else if((p1Choice == 's' && p2Choice == 'r') || (p1Choice == 'p' && p2Choice == 's') || (p1Choice == 'r' && p2Choice == 'p'))
        {
            p2.addWin();
            p1.addLoss(); 
        }
        else if((p1Choice == 'r' && p2Choice == 'r') || (p1Choice == 's' && p2Choice == 's') || (p1Choice == 'p' && p2Choice == 'p'))

        {
            p1.addTie(); 
            p2.addTie(); 
        }

    }

    private void displayResults()//just displays the users results and information. 
    {
        JOptionPane.showMessageDialog(null,p1); 
        JOptionPane.showMessageDialog(null, p2); 
    }

    private void finalWinner()
    {
        if(p1.getWin() > p2.getWin())
        {
            JOptionPane.showMessageDialog(null,"YOU DEFEATED ROCKY! GOOD JOB CHAMP!"); 
        }
        else if(p1.getWin() < p2.getWin())
        {
            JOptionPane.showMessageDialog(null,"Rocky has defeated you. I guess that's why he is the champ."); 
        }
        else
            JOptionPane.showMessageDialog(null,"You and Rocky fought hard, but alas, you have tied."); 

    }

    private static String newId()
    {
        idNum++;
        return id + String.valueOf(idNum);
    }

}

