package guru.springframework.jokes.chuckjokes.services;

import  guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJoke() {
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        return joke.getRandomQuote();
    }
}
