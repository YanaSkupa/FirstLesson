package org.example.lesson11;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Collections {
    public static void main(String[] args) {
       
        String s ="1 string";
        Cat cat = new Cat();
        Dog dog = new Dog ();
        List<String> strings = new ArrayList<>();
        strings.add(s);

       List<Animall> animalls1 = new ArrayList<>();
       animalls1.add(cat);
       animalls1.add(dog);

       List<Voice> voices= new ArrayList<>();
        animalls1.add(cat);
        animalls1.add(dog);

        List<Voice> plays = new ArrayList<>();
        animalls1.add(cat);
        animalls1.add(dog);


        for (int i = 0; i <strings.size(); i++){
            System.out.println(strings.get((i)));
            }
        List<Voice> voiceList = new ArrayList<>();
        animalls1.add(cat);
        animalls1.add(dog);

        for (Voice voice : voices ) {
            Voice.doVoice();
        }
    }
}
