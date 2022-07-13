import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

      
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        Bot firstNew = new Bot(input.nextLine());
        firstNew.greeting();
        firstNew.help();
        System.out.println("What's the weather like?");
        firstNew.weather();
        System.out.println("How many feet in a mile?");
        firstNew.feetInMile();
        firstNew.goodbye();
        
        
    }
}
