package com.crabsoup.timecapsule.service;

import java.util.List;

import com.crabsoup.timecapsule.model.Letter;

public interface LetterService {

    Letter createLetter(Letter letter);

    List<Letter> getAllLetters();

    Letter getLetterById(Long id);

    void deleteLetter(Long id);

    
}
