import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
        line();
        System.out.println("\t    Welcome to Rock, Paper, Scissors!");
        String userChoice;
        line();
        String[] rps = {"rock", "paper", "scissors"};
        int uscore=0;
        int cscore=0;
        do{
            System.out.println("\tEnter your choice (rock, paper, or scissors)");
            do{
                line();
                System.out.print("User: ");
                userChoice = sc.nextLine();
                if (userChoice.equals(rps[0]) || userChoice.equals(rps[1]) || userChoice.equals(rps[2])) {
                    break;
                }
                else {
                    line();
                    System.out.println("  Invalid input! Please enter rock, paper, or scissors.");
                    continue;
                }
            }while(true);
            int computer = random.nextInt(3);
            String computerChoice = rps[computer];
            space();
            System.out.println("Computer chooses: " + computerChoice);
            space();
            
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                uscore ++;
                cscore ++;
                System.out.println("It's a tie! \n\nUser: "+uscore+" & Computer: "+cscore);
            } 
            else if ((userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) ||
                   (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                   (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))) 
            {
                uscore ++;
                System.out.println("Congratulation You win! \n\nUser: "+uscore+" & Computer: "+cscore);
            } 
            else if ((computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("scissors")) ||
                   (computerChoice.equalsIgnoreCase("paper") && userChoice.equalsIgnoreCase("rock")) ||
                   (computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("paper"))) 
            {
                cscore ++;
                System.out.println("Computer win! Better luck next time. \n\nUser: "+uscore+" & Computer: "+cscore);
            }
            else {
                System.out.println("Invalid Input");
            }
            line();
            System.out.print("\t  Press any key to continue & (E) to exit: ");
            userChoice = sc.nextLine();
            line();
            if(userChoice.equalsIgnoreCase("e")){
                System.out.println("\t\t    Program Exit!");
                line();
                break;
            }
            else{
                continue;
            }
        }while(true);
        
        
	}
	public static void line(){
	    System.out.println("-------------------------------------------------------------");
	}
	public static void space(){
	    System.out.println("");
	}
}
