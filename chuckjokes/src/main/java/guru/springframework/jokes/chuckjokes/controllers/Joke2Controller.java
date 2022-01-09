package guru.springframework.jokes.chuckjokes.controllers;

import guru.springframework.jokes.chuckjokes.services.Joke2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Joke2Controller {
    Joke2 joke;

    public Joke2Controller(Joke2 joke) {
        this.joke = joke;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model) {
        model.addAttribute("joke", joke.getJoke());
        return "index";
    }
}
