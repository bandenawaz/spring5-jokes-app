package com.illuminateskills.spring5okesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
//@NoArgsConstructor(force = true)
public class JokesServiceImpl implements JokesService {

    private  final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
