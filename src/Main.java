import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamagotchi blyat");

        System.out.println("Choose a name for tamagotchi, davai");
        tamagotchi.Name = scanner.nextLine();

        System.out.println("-_-  " + tamagotchi.Name + "? Really? Ok then.");

        while (tamagotchi.GetAlive()) {
            tamagotchi.PrintStats();
            System.out.println("");
            tamagotchi.choices();
            String choice = scanner.nextLine();
            if (choice == "1"){
                tamagotchi.Hi();
            }
            else if (choice == "2"){
                tamagotchi.feed();
            }
            else if (choice == "3"){
                System.out.println("What word do you wanna teach them?");
                String word = scanner.nextLine();
                tamagotchi.Teach(word);
            }
            else {
                System.out.println("Staring intensly at " + tamagotchi.Name + ".");
            }


            tamagotchi.Tick();
            System.out.println("Press [ENTER] to continue.");
            scanner.nextLine();
        }

        System.out.println("You really let " + tamagotchi.Name + " die that easy huh? Not cool.");
        System.out.println("Press [ENTER] and leave me. Alone.");
    }
}