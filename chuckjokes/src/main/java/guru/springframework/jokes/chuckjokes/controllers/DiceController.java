package guru.springframework.jokes.chuckjokes.controllers;

import guru.springframework.jokes.chuckjokes.services.DiceRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiceController {
    DiceRoll diceRoll;

    @Autowired
    public DiceController(DiceRoll diceRoll) {
        this.diceRoll = diceRoll;
    }

    @RequestMapping("/dice")
    public String getRoll(Model model) {
        model.addAttribute("joke", diceRoll.rollDice());
        return "index";
    }

}
