package com.landont.shadowbaneapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Owner on 12/29/2017.
 */

public class Character {
   // private Rune [] Runes = {};
    private CharacterClass Class;
    private String race;
    List<String> Races = new ArrayList<String>(Arrays.asList("Human","Aeldborn","Aracoix","Centaur","Dwarf","Elf","Half Giant","Irekei","Minotaur","Nephilim","Shade","Vampire"));

    public String getRace() {
        return race;

    }

    //Checks for valid race and returns 0 on incorrect input. 1 for successful input
    public void setRace(String race) {
        if (Races.contains(race)){
            this.race = race;
        }
    }




}
