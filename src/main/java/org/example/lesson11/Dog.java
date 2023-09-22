package org.example.lesson11;

public class Dog extends Animall implements Voice,Play {
    public void doVoice(){
        System.out.println("Dogs voice");

        }
    public void doPlay(){
        System.out.println("Dog do play");
    }

}

