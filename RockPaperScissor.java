package a;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissor"};
        int rounds = 3;
        int userPoints = 0;
        int computerPoints = 0;
  
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        System.out.println("\t\tWelcome to Rock, Paper, Scissor Game!\n");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        
        System.out.println("Get ready to battle the computer in " + rounds + "exciting rounds!\n");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        
        for (int i = 0; i < rounds; i++)
        {
            System.out.println("\nRound " + (i + 1));
            String userChoice = getUserChoice(scanner);
            String computerChoice = getComputerChoice(random, choices);

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
            
            if (result.contains("win"))
            {
                userPoints++;
            } 
            else if (result.contains("lose"))
            {
                computerPoints++;
            }
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        System.out.println("\nFinal Scores:");
        System.out.println("You: " + userPoints);
        System.out.println("Computer: " + computerPoints);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        if (userPoints > computerPoints) 
        {
            System.out.println("Congratulations! You are the rock, paper, scissor champion!");
        } else if (userPoints < computerPoints)
        {
            System.out.println("Sorry, you lost the game. Better luck next time!");
        } 
        else 
        {
            System.out.println("It's a tie! Well played.");
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        System.out.println("Thank you for playing. Have a great day!");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");
        
        
        scanner.close();
    }

    private static String getUserChoice(Scanner scanner)
    {
        while (true)
        {
            System.out.println("Enter rock, paper or scissor:");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissor")) 
            {
                return choice;
            }
            else 
            {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    private static String getComputerChoice(Random random, String[] choices)
    {
        int index = random.nextInt(choices.length);
        return choices[index];
    }

    private static String determineWinner(String userChoice, String computerChoice)
    {
        if (userChoice.equals(computerChoice))
        {
            return "It's a tie!";
        } 
        else if ((userChoice.equals("rock") && computerChoice.equals("scissor")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissor") && computerChoice.equals("paper"))) {
            return "You win this round!";
        } 
        else
        {
            return "You lose this round.";
        }
    }
}