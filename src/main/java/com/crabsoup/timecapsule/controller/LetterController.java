package com.crabsoup.timecapsule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crabsoup.timecapsule.service.LetterService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/letter")
@RequiredArgsConstructor
public class LetterController {

    private final LetterService letterService;

    @PostMapping
    public Letter createLetter(@RequestBody Letter letter) {
        return letterService.createLetter(letter);
    }

    @GetMapping
    public List<Letter> getAllLetters() {
        return letterService.getAllLetter();
    }

    
}
