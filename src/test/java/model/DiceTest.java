package model;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void roll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1()>0 && dice.getDie1()<7);
        assertTrue(dice.getDie2()>0 && dice.getDie2()<7);
    }

    @org.junit.jupiter.api.Test
    void isDouble() {
        Dice dice = new Dice();
        dice.roll();
        if(dice.getDie1() == dice.getDie2()){
            assertTrue(dice.isDouble());
        }else{
            assertFalse(dice.isDouble());
        }
    }
}