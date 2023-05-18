package com.dmdev.lesson18;

import com.dmdev.lesson15.Archer;
import com.dmdev.lesson15.Warrior;
import com.dmdev.lesson18.weapon.Bow;
import com.dmdev.lesson18.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer=new Archer<>("Робингуд",15,40);
        archer.setWeapon(new Bow());
        Warrior<Sword>warrior=new Warrior<>("Валерия",25,100);
        warrior.setWeapon(new Sword());
    }
}
