import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Creating array of quotes
        String[] quotes = {
                "People's lives don't end when they die, it ends when they lose faith. " +
                        "- Itachi Uchiha (Naruto)",
                "A lesson without pain is meaningless. " +
                        "- Edward Elric (Fullmetal Alchemist)",
                "Power comes in response to a need, not a desire. " +
                        "- Goku (Dragon Ball Z)",
                "The moment people come to know love, they run the risk of carrying hate. " +
                        "- Obito Uchiha (Naruto)",
                "No matter how deep the night, it always turns to day eventually. " +
                        "- Brook (One Piece)",
                "If you don't take risks, you can't create a future. " +
                        "- Monkey D. Luffy (One Piece)",
                "It's not the face that makes someone a monster; it's the choices they make with their lives. " +
                        "- Naruto Uzumaki (Naruto)",
                "Fear is not evil. It tells you what your weakness is. " +
                        "- Gildarts Clive (Fairy Tail)",
                "Whatever you lose, you'll find it again. But what you throw away you'll never get back. " +
                        "- Kenshin Himura (Rurouni Kenshin)",
                "The world isn't perfect. But it's there for us, doing the best it can. That's what makes it so beautiful. " +
                        "- Roy Mustang (Fullmetal Alchemist)"
        };
        // Variable to determine if the loop continues
        String input; // storing y/n
        // Do-While loop
        do {
            System.out.println("\n===== Famous Quotes =====");
            System.out.println("Enter a number from 1-10 for a quote(0 for a random one): ");
            System.out.print("Choice: ");
            try {
                int choice = read.nextInt(); // Reads user choice(number)
                read.nextLine();
                if (choice == 0) {
                    displayRandomQuote(quotes);
                }
                else {
                    displayQuote(quotes, choice);
                }
            }
            // Catches errors when input is out of 0-10
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Enter a number from 1-10");
            }
            // Catches errors for input as typing letters for numbers
            catch (Exception e) {
                System.out.println("Invalid input: Enter a number");
                read.nextLine();
            }
            // If the user wants another quote
            System.out.println("\nWould you like another quote? (y/n): ");
            input = read.nextLine();
        }
        // Looping while user chooses y
        while (input.equalsIgnoreCase("y"));
        System.out.println("Ending");
        read.close();
    }
    // Method for displaying quote choice
    public static void displayQuote(String[] quotes, int choice) {
        System.out.println("\nQuotes: ");
        System.out.println(quotes[choice -1]); // Subtracting 1, array starts at 0
    }
    // Method for random quote
    public static void displayRandomQuote(String[] quotes) {
        Random random = new Random(); // Creating random object
        int randomIndex = random.nextInt(quotes.length); // generates random number from 0-9
        System.out.println("\nRandom Quote for you: ");
        System.out.println(quotes[randomIndex]); // displaying quote
    }
}
