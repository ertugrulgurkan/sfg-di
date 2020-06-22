package com.ertugrul.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"TR" , "default"})
@Service("I18nService")
public class I18nTurkishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Merhaba Dünya - TR";
    }
}
