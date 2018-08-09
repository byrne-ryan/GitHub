import java.util.Scanner;
import java.util.Random;
public class ZGreetingProject {
    public static void main(String[]args){
        //My prompt for user input
        System.out.println("Please enter y to generate a greeting: ");
        //Creating an area for the user to input
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Random rand = new Random();
        //Creating list of greetings
        String[] greeting = {"Hello","How are you", "Good Morning","Good Day"};
        int i = 0;
        while(i < 1);
        {
        //1st attempt at retrieving random greeting from list
        {
            i++;
        int GREETINGS = rand.nextInt(greeting.length);
        switch(line){

            case"y":
                System.out.print("Printing random greeting: ");
                    System.out.println("Your greeting is: " + greeting[i]);
                    break;

        default:
            System.out.println("Command not recognised");
            break;

                }


                }
                }

        }


    }

