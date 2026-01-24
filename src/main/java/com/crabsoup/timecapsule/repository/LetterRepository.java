package com.crabsoup.timecapsule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crabsoup.timecapsule.model.Letter;

public interface LetterRepository extends JpaRepository<Letter, Long> {
    
}
