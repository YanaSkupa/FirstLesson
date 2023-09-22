package org.example.lesson11;

public class Cat extends Animall implements Voice ,Play {
    public void doVoice(){
        System.out.println("Cats voice");

   }
   public void doPlay(){
    System.out.println("Cats do play");
   }

}
