package guru.springframework.jokes.chuckjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class Joke2Impl implements Joke2 {

    @Override
    public String getJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }

}
