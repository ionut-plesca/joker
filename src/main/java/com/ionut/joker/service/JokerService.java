package com.ionut.joker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JokerService {

    private static final Logger log = LoggerFactory.getLogger(JokerService.class);

    Random random = new Random();

    public Set<Integer> extractNumbers(){
        Set<Integer> extraction = new HashSet<>();
        int number;
        while(extraction.size()<5){
            number = random.nextInt(46);
            if(number>0){
                extraction.add(number);
            }
        }
        log.info("The extracted numbers are: {}", extraction );
        return extraction;
    }

    public int extractJoker(){
        int joker;
        do {
            joker = random.nextInt(21);
        } while(joker == 0);
        log.info("Joker is: {}",joker);
        return joker;
    }
}
