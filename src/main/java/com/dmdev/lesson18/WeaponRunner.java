package com.dmdev.lesson18;

import com.dmdev.lesson15.Archer;
import com.dmdev.lesson15.Hero;
import com.dmdev.lesson15.Warrior;
import com.dmdev.lesson18.weapon.Bow;
import com.dmdev.lesson18.weapon.MeleeWeapon;
import com.dmdev.lesson18.weapon.Sword;
import com.dmdev.lesson18.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Робингуд", 15, 40);
        archer.setWeapon(new Bow());
        Warrior<Sword> warrior = new Warrior<>("Валерия", 25, 100);
        warrior.setWeapon(new Sword());
        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<Sword> hero) {
        Sword weapon = hero.getWeapon();
        hero.setWeapon(new Sword());
        System.out.println(hero.getWeapon().getDamage());
    }
}
