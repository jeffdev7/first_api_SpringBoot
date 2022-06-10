import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("\nWelcome to the new version of FoodApp in Java\n");
        System.out.println("Menu\n");

        while(true)
        {
            ArrayList<String> burgers = new ArrayList<String>();
            burgers.add("1 - Chickpeas hamburger");
            burgers.add("2 - Lentils hamburger");
            burgers.add("3 - Beans hamburger");
            burgers.add("4 - Seeds hamburger");

            for(String s : burgers)//foreach version
            {
                System.out.println(s);
            }
            System.out.println("\nType the number of your order, please.\n");
            Scanner myOption = new Scanner(System.in);
            int optionInput = myOption.nextInt();

            switch(optionInput)
            {
                case 1: System.out.println("You chose a chickpeas hamburger.\nAnything else? If not, type 0\n");
                    break;
                case 2: System.out.println("You chose a Lentils hamburger.\nAnything else? If not, type 0\n");
                    break;
                case 3: System.out.println("You chose a Beans hamburger.\nAnything else? If not, type 0\n");
                    break;
                case 4: System.out.println("You chose a Seeds hamburger.\nAnything else? If not, type 0\n");
                    break;
                case 0:
                    System.out.println("Thank you! Come back soon!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please choose a valid option");
                    System.exit(0);
            }
        }

    }
}