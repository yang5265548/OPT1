package model;

public class Dice {
    private int die1;
    private int die2;
    private int count;

    public int getDie2() {
        return die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getCount() {
        return count;
    }

    public void roll() {
        System.out.println("Rolling the dice...");
        this.die1 = (int) (Math.random() * 6) + 1;
        this.die2 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1: " + this.die1);
        System.out.println("Die 2: " + this.die2);
        count++;
    }

    public boolean isDouble() {
        return this.die1 == this.die2;
    }


}
