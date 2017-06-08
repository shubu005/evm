import java.util.Scanner;

public class BU {


    private Scanner keyboard;
    
    

    private Ballotting ballot=new Ballotting("hardy","punk","cena");

    private String votingMessage;

 
    public BU()
    {
        keyboard = new Scanner(System.in);
    }

    public void list()   
    {

        int command = -1;
        while(command != 0)       
        {
            displayMainMenu();
            command = getCommand();

            execute(command);
        }

    }

    private void displayMainMenu()
    {

        System.out.println("Options are");
        System.out.println("**vote for Hardy **     Enter 1");
        System.out.println("**vote for punk **      Enter 2");
        System.out.println("**vote for Cena **      Enter 3");
        
        System.out.println("To exit    Enter 0");
    }
 

    private void execute(int command)

    {
        if(command == 1)
       {

            ballot.c1.CountVote();
        }
        else if(command == 2)
        {

        	ballot.c2.CountVote();
        }
        else if(command == 3)
        {
        	ballot.c3.CountVote();
        }
                  
        else if(command == 0)

        {

            System.out.println(" Program closing down");

        }

        else

        {

            System.out.println("Unknown command");

            //candidate.castVote();

        }

    }

    private int getCommand()

    {

        System.out.print("Enter command: ");

        return keyboard.nextInt();

    }
	
	
}
