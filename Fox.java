package Story1;

import java.util.Random;
import java.util.Scanner;

public class Fox {
    public static void main(String[] args) {
        System.out.println("Welcome to Leon's story! Sit back, relax and Enjoy :)");

        //Get random character names pseudocode
        Random sexOfPlayer = new Random();
        String[] sex = {"male", "female"};

        Random characterOfPlayer = new Random();
        String[] characters = {"Fox", "Dog", "Cat"};

        //Get random age between 18 and 25
        Random randAge = new Random();
        int age = 0;


        //Add items to pick up
        int numberOfItems = 0;
        String[] food = {"Sandwich", "Crisps", "Chocolate Bar"};
        String[] miscItems = {"Book"};


        //Try to sort out the game so it prints out each word at a time


        //Game
        boolean running = true;
        while (running) {
            try {
                //Get users input to steer the course of the story
                Scanner input = new Scanner(System.in);

                Thread.sleep(3000);
                System.out.print("One day there was a fox named ");
                Thread.sleep(1000); // do nothing for 1000 milliseconds (1 second)
                System.out.print("Alex.");
                Thread.sleep(2000);
                System.out.print("\n");

                System.out.print("He is 19 years old and ");
                Thread.sleep(1000);
                System.out.print("living with his mother.");
                Thread.sleep(2000);
                System.out.print("\n");

                System.out.print("He has one annoying sister named ");
                Thread.sleep(1000);
                System.out.print("Hollie.");
                Thread.sleep(2000);
                System.out.print("\n");

                System.out.print("He is on his final year at college ");
                Thread.sleep(1000);
                System.out.print("and ready to explore the outside world.");
                Thread.sleep(2000);
                System.out.print("\n");

                //Choose a place to go
                System.out.println("################");
                System.out.println("Where do you want to go next?: ");
                System.out.println("1. Bedroom");
                System.out.println("2. Kitchen");
                System.out.println("3. Garden");
                System.out.println("4. Sister's Room");
                System.out.println("################");

                String place = input.nextLine();
                if (place.equals("1")) {
                    System.out.println("Ughh, my bedroom is a mess. I really need to clean up.");
                    break;
                }
                if (place.equals("2")) {
                    System.out.println("Im feeling quite hungry. What's for snack?");
                    
                    break;
                }
                if (place.equals("3")) {
                    System.out.println("*takes a deep breath* Ahhh, what a beautiful day!");
                    break;
                }
                if (place.equals("4")) {
                    System.out.println("*Sister shouts at you* GET OUT! NO BOYS ALLOWED!");
                    Thread.sleep(2000);
                    System.out.println("*You say to yourself* Ok, Ok, Jeeze! No need to be a bitch about it.");
                    break;
                }


            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }
}

