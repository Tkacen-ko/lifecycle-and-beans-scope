package ru.itsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("prototype")
@Component
public class KindFarmer {
    private Animal animal;

    public KindFarmer(){
        System.out.println("Constructor KindFarmer");
    }

    public void hiToAnimal(){
        System.out.println("Привет моя любимая");
        animal.say();
    }
    @Autowired
    public void setAnimal(Animal animal){
        System.out.println("Setter");
        this.animal = animal;
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct");
    }
}
