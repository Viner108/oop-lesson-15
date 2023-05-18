package com.dmdev.lesson18.weapon;

import com.dmdev.lesson18.weapon.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage(){
        return 10;
    }
}
