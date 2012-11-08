import javax.swing.*; 
/**
 * Records the wins and losses of the players in the game. 
 *
 */
public class Player
{
    // instance variables - replace the example below with your own
    private String firstName; 
    private String lastName; 
    private String idNum; 
    private int win; 
    private int loss; 
    private int tie; 
    private char curPlay; 

    public Player()//default constructor
    {
        firstName = "none"; 
        lastName = "none"; 
        idNum = "0"; 
        win = 0; 
        loss = 0; 
        tie = 0; 
        curPlay = ' '; 
    }

    public Player(String id)
    {
        idNum = id; 
        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");
        curPlay = ' '; 
        

        
        
    }
    
    public Player(String first, String last, String id)
    {

        firstName = first; 
        lastName = last; 
        idNum = id; 
        win = 0; 
        loss = 0; 
        tie = 0; 
        curPlay = ' '; 

    }

    public void addWin()
    {
       win = win + 1; 
    }

    
    public void addLoss()
    {
        loss = loss + 1; 
    }

    public void addTie()
    {
        tie = tie + 1;  
    }

    public String toString()// method that is called by driver
    {
                    return ("Character Stats \n"+ 
                           "First name: " +firstName+"\n"+ 
                           "Last name: " + lastName+"\n"+
                           "ID number: "+idNum+"\n"+ 
                           "Current play: "+ curPlay+"\n"+ 
                           "Wins: " +win+"\n"+ 
                           "Losses: "+loss+"\n"+ 
                           "Ties: " +tie+"\n"); 
      
    }

    public String getFirstName()
    {
        return firstName; 
    }

    public void setFirstName(String first)
    {
        firstName = first; 
    }

    public String getLastName()
    {
        return lastName; 
    }

    public void setLastName(String last)
    {
        lastName = last; 
    }

    public String getIdNum()
    {
        return idNum; 
    }

    public void setIdNum(String id)
    {
        idNum = id; 
    }

    public int getWin()
    {
        return win; 
    }

    public void setWin(int w) 
    {
        win = w; 
    }

    public int getLoss()
    {
        return loss; 
    }

    public void setLoss(int l) 
    {
        loss = l; 
    }

    public int getTie()
    {
        return tie; 
    }

    public void setTie(int t) 
    {
        tie = t; 
    }

    public char getCurPlay()
    {
        return curPlay; 
    }

    public void setCurPlay(char c)
    {
        curPlay = c; 
    }
}

    
    
    
    
    
    