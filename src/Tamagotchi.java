import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {

    private int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive;
    public String Name;
    Random rand = new Random();

    public Tamagotchi() {
        isAlive = true;
        words.add("blyat");
    }


    public void Tick() {
        hunger++;
        boredom++;
        if (hunger > 10 || boredom > 10) {
            isAlive = false;
        }
    }

    public void choices() {
        System.out.println("What's the next move?");
        System.out.println("1. Talk to whatever that thing is?");
        System.out.println("2. Feed the bastard?");
        System.out.println("3. Educate your creature with a new word?");
        System.out.println("4. Stay silent.");
    }

    public void feed() {
        System.out.println(Name + " is fed and becomes less hungry.");
        hunger -= 2;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void Hi() {
        int wordNum = rand.nextInt(words.size());
        System.out.println(Name + " says: " + words.get(wordNum));
        ReduceBoredom();
    }

    public void Teach(String word) {
        System.out.println("You teach " + Name + "to say: " + word);
        words.add(word);
        ReduceBoredom();
    }

    public void PrintStats() {
        System.out.println("Tamagotchi name: " + Name + " || Level of hunger: " + hunger + " || Level of boredom: " + boredom + " || Known words: " + words.size() + "words");
    }

    public boolean GetAlive() {
        return isAlive;
    }

    private void ReduceBoredom() {
        System.out.println("You play with " + Name + ", reducing its boredom.");
        boredom -= 2;
        if (boredom < 0) {
            boredom = 0;
        }
    }
}