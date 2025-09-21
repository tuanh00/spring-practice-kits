package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    private Tyres tyres;
    private Speakers speakers;

    public VehicleServices(Tyres tyres, Speakers speakers) {
        this.tyres = tyres; // injects @Primary MichelinTyres
        this.speakers = speakers; // injects @Primary SonySpeakers
    }

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println("Playing music with " + music);
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        System.out.println("Moving " + status);
    }
}
