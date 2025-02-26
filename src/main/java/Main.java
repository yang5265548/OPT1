import model.Dice;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        do{
            dice.roll();

    }while (!dice.isDouble());

        System.out.println("You rolled a double！");
        System.out.println("After " +(dice.getCount()-1 )+ " try both reach the same value ");
    }
}
