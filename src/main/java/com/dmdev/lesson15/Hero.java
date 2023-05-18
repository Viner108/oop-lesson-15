package com.dmdev.lesson15;

import com.dmdev.lesson18.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private String name;
    private int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void takeDamage(int enemyDamage);
    public abstract boolean isAlive();
    public String getName() {
        return name;
    }


    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
