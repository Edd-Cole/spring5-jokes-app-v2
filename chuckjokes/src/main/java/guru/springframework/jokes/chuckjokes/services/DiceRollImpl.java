package guru.springframework.jokes.chuckjokes.services;

import org.springframework.stereotype.Service;

@Service
public class DiceRollImpl implements DiceRoll {
    @Override
    public int rollDice() {
        int roll = (int) Math.ceil(Math.random() * 6);
        return roll;
    }
}
