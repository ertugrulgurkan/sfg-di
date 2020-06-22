package com.ertugrul.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogPetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}