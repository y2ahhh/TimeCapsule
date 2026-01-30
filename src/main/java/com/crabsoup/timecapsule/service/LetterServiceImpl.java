package com.crabsoup.timecapsule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crabsoup.timecapsule.model.Letter;
import com.crabsoup.timecapsule.repository.LetterRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LetterServiceImpl implements LetterService {

    private final LetterRepository letterRepository;

    @Override
    public Letter createLetter(Letter letter) {
        return letterRepository.save(letter);
    }

    @Override
    public List<Letter> getAllLetters() {
        return letterRepository.findAll();
    }

    @Override
    public Letter getLetterById(Long id) {
        return letterRepository.findById(id).orElseThrow(() -> new RuntimeException("검색 결과가 없습니다"));
    }

    @Override
    public void deleteLetter(Long id) {
        letterRepository.deleteById(id);
    }
    
}
