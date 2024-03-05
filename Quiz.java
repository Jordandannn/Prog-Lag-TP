import java.util.*;
public class Quiz
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		do {
			line();
		    System.out.println("\t\t  WELCOME TO HARRY POTTER QUIZ");
		    line();
		    System.out.println("Click (Q) to take quiz & (E) to exit. ");
		    line();
            System.out.print("Enter your Answer: ");
		    String ans = sc.nextLine();
		    
		    if(ans.equalsIgnoreCase("q")) {
			    do {
			    	line();
			    	System.out.println("Click (M)for Multiple Choice and (I)for Identification & (E) to Exit.");
			    	line();
		            System.out.print("Enter your Answer: ");
		            ans = sc.nextLine();
		                if (ans.equalsIgnoreCase("M")) { 
		                		multiplechoice();
		                        break;
		                } 
		                else if(ans.equalsIgnoreCase("I")) {
		                		identification();
		                		break;
		                }
		                else if(ans.equalsIgnoreCase("E")) {
		                	line();
		                	nl();
		                    System.out.println("\t\t------------------------------");
		                    System.out.println("\t\t|        Program Exit        |");
		                    System.out.println("\t\t------------------------------");
		                    nl();
		                    line();
		                    break;
		                }
		                else {
		                    nl();
		                    System.out.println("\t\t---------------------------------");
		                    System.out.println("\t\t| PLEASE CHOOSE M, I, or E ONLY |");
		                    System.out.println("\t\t---------------------------------");
		                    nl();
		                    continue; 
		                }
		                
		        } while (true);
		    }
		    else if(ans.equalsIgnoreCase("e")) {
            	nl();
                System.out.println("\t\t------------------------------");
                System.out.println("\t\t|        Program Exit        |");
                System.out.println("\t\t------------------------------");
                nl();
                line();
		    	break;
		    }
		    
		    
		}while(true);
	    
	} 
	public static void multiplechoice() {
		Scanner sc = new Scanner(System.in);
		int score = 0;
	    String[] Questions = 
	    {
	        "Name Harry Potter's parents.",
	        "Name the killing curse.",
	        "What spell would you use to light the tip of your wand?",
	        "How many Harry Potter books have been published in total?",
	        "What are the names of golden trio?",
	        "How many Harry Potter movies are there?",
	        "What is the name of the first Harry Potter book or movie?",
	        "Dobby has a master?"
	    };
	    
	    String [] Choices = 
	     {
	         "a. James and Lily Potter b. Hardy and Ryza Potter c. None of the above",
	         "a. Specto Patronum b. Avada Kedavra c. Both",
	         "a. Lumos b. None c. Alohomora",
	         "a. 7 b. 9 c. 11",
	         "a. Chochang-Harry-Hermoine b. Ron-Hermoine-Harry c. None of the above",
	         "a. 1 b. 11 c. 7",
	         "a. Pilosopher's Stone b. Chamber of Secrets c. Prizoner of Azcaban",
	         "a. True b. False c. None of the above"
	     };
	          
	    String ktc []= {"a", "b", "a", "c", "b", "c", "a", "b"}; 
	    
	    shuffleArraysMultiple(Questions, Choices, ktc);
	    
	    line();
	    System.out.println("\tInstruction: Choose the letter of the correct Answer.");
	    for(int a = 1; a < 6; a++){
	        line();
	        System.out.println(a+".) "+Questions[a]);
	        nl();
	        System.out.println(Choices[a]);
	        nl();
	        String ans;
	        do {
                System.out.print("Enter your Answer: ");
                ans = sc.nextLine();
                	if (ans.matches("[a-cA-C]+")) {
                		break;
                	}
                   
                    else {
                        nl();
                        System.out.println("\t\t--------------------------------");
                        System.out.println("\t\t|PLEASE CHOOSE a, b, or c ONLY.|");
                        System.out.println("\t\t--------------------------------");
                        nl();
                        continue; 
                    }
                    
            } while (true);
	        if (ans.equalsIgnoreCase(ktc[a])) {
            	nl();nl();
                System.out.println("\t\t--------------------------------");
                System.out.println("\t\t|   YOUR ANSWER IS CORRECT!    |");
                System.out.println("\t\t--------------------------------");
                nl();
            	score++;           
            }
            else {
            	nl();
            	nl();nl();
                System.out.println("\t\t--------------------------------");
                System.out.println("\t\t|    YOUR ANSWER IS WRONG!     |");
                System.out.println("\t\t--------------------------------");
                nl();
            }
	        
	    }
	    line();
	    nl();
	    double rate = score * 20;
	    if(rate >= 50){
	        System.out.println("Congratulation! you got a "+rate+"% rate and a score of " +score+ "/5.");
	    }
	    else{
	        System.out.println("Sorry you got a "+rate+"% rate and a score of " +score+ "/5. Better luck next time!");
	    }
	    nl();
	    line();
	}
	public static void identification(){
		Scanner sc = new Scanner(System.in);
		int score = 0;
	    String[] Questions = 
	    {
	        "First name of Harry Potter's mother.",
	        "Comple the name of the killing curse Avada -------.",
	        "What spell would you use to light the tip of your wand?",
	        "How many Harry Potter books have been published in total?",
	        "Ron-Hermoine-Harry are the names of golden trio? True or False?",
	        "How many Harry Potter movies are there? ",
	        "Pilosopher's Stone is the first Harry Potter book? True or False?",
	        "Dobby has a master? True or False?"
	    };
	          
	    String ktc []= {"Lily", "Kedavra", "Lumos", "11", "True", "7", "True", "False"}; 
	    
	    shuffleArraysIdentification(Questions, ktc);
	    
	    line();
	    System.out.println("\t\tInstruction: Write the correct Answer.");
	    for(int a = 1; a < 6; a++){
	        line();
	        System.out.println(a+".) "+Questions[a]);
	        nl();
	        String ans;
	        do {
                System.out.print("Enter your Answer: ");
                ans = sc.nextLine();
                
                	if (ans.matches("[a-zA-Z0-9]+")) { 
                            break;
                    } 
                    else {
                        nl();
                        System.out.println("\t\t--------------------------------");
                        System.out.println("\t\t|        INVALID INPUT!        |");
                        System.out.println("\t\t--------------------------------");
                        nl();
                        continue; 
                    }
                    
            } while (true);
            if (ans.equalsIgnoreCase(ktc[a])) {
            	nl();nl();
                System.out.println("\t\t--------------------------------");
                System.out.println("\t\t|   YOUR ANSWER IS CORRECT!    |");
                System.out.println("\t\t--------------------------------");
                nl();
            	score++;           
            }
            else {
            	nl();
            	nl();nl();
                System.out.println("\t\t--------------------------------");
                System.out.println("\t\t|    YOUR ANSWER IS WRONG!     |");
                System.out.println("\t\t--------------------------------");
                nl();
            }
	        
	    }
	    line();
	    nl();
	    double rate = score * 20;
	    if(rate >= 50){
	        System.out.println("Congratulation! you got a "+rate+"% rate and a score of " +score+ "/5.");
	    }
	    else{
	        System.out.println("Sorry you got a "+rate+"% rate and a score of " +score+ "/5. Better luck next time!");
	    }
	    nl();
	    line();
	}
	public static void line(){
	        System.out.println("----------------------------------------------------------------------");
	}
	public static void nl(){
	    System.out.println();
	}
	public static void shuffleArraysMultiple(String[] quest, String[] choices, String[] ktc) {
        Random rnd = new Random();
        for (int i = quest.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            
            String temp = quest[index];
            quest[index] = quest[i];
            quest[i] = temp;
            
            temp = choices[index];
            choices[index] = choices[i];
            choices[i] = temp;
            
            temp = ktc[index];
            ktc[index] = ktc[i];
            ktc[i] = temp;
        }
    }
	public static void shuffleArraysIdentification(String[] quest, String[] ktc) {
        Random rnd = new Random();
        for (int i = quest.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            
            String temp = quest[index];
            quest[index] = quest[i];
            quest[i] = temp;
            
            temp = ktc[index];
            ktc[index] = ktc[i];
            ktc[i] = temp;
        }
    }
}

