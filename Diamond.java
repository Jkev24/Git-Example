import java.util.Scanner; 
/**
 * Write a description of class Asterisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        int input = 0; 
        int spaces = input; 
        int ast;
        int count = 0; 

        System.out.println("Please enter an odd number you would like the longest line of the diamond to be."); 
        input = keyboard.nextInt(); 

        for(int i = 1; i <= input; i++)
        {
            if(i%2 != 0)
            {
                spaces = (input -i)/2;
                for(int j = 1; j <= input; j++)
                {
                    if(j <= spaces)
                    {
                        System.out.print(' '); 
                        count++;// Keeps track of number of spaces used.

                    }

                    else if(j > spaces && j + count <= input)// I knew that i = # of * I wanted. So I figured out that # of * = input - spaces.
                    {
                        System.out.print('*');
                    }
                }
                System.out.println(); 
                count = 0; 
            }

            if(i == input)
            {
                for(int k = input-2; k >= 0; k--)
                {
                    if(k%2 != 0)
                    {
                        spaces = (input -k)/2;

                        for(int j = 1; j <= input; j++)
                        {

                            if(j <= spaces)
                            {
                                System.out.print(' '); 
                                count++; 

                            }

                            else if(j > spaces && j + count <= input) 
                            {
                                System.out.print('*');
                            }
                        }
                        System.out.println(); 
                        count = 0; 
                    }
                }
                i = i+1;
            }

        }

    }

}

