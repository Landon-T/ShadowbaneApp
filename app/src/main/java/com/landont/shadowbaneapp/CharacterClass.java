package com.landont.shadowbaneapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Owner on 1/2/2018.
 */

public class CharacterClass {
    public String name;
    private Integer HumanTP;
    private Integer NonHumanTP;
    private Integer StrBonus = 0;
    private Integer DexBonus = 0;
    private Integer ConBonus = 0;
    private Integer IntBonus = 0;
    private Integer SpiBonus = 0;
    public Integer Image;

    @Override
    public String toString() {
        return name;
    }

    public CharacterClass(String name, Integer humanTP, Integer nonHumanTP, Integer strBonus, Integer dexBonus, Integer conBonus, Integer intBonus, Integer spiBonus, Integer image) {
        this.name = name;
        HumanTP = humanTP;
        NonHumanTP = nonHumanTP;
        StrBonus = strBonus;
        DexBonus = dexBonus;
        ConBonus = conBonus;
        IntBonus = intBonus;
        SpiBonus = spiBonus;
        Image = image;
    }
}
