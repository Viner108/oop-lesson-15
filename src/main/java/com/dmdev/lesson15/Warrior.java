package com.dmdev.lesson15;

public class Warrior extends Hero {
    private int health;
    public Warrior(String name, int damage,int health) {
        super(name, damage);
        this.health=health;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " с разбегу кидает меч, в надежде нанести урон по " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
    public void takeDamage(int enemyDamage) {
        if (isAlive() && health <= enemyDamage) {
            health = 0;
            System.out.println(getName() + " получает смертельный урон и больше не может сражаться");
        } else {
            this.health -= Math.min(health, enemyDamage);
            System.out.println(getName() + " получат слюной по телу, -" + enemyDamage + " здоровья. " + health + " осталось здоровья");
        }
    }
    public boolean isAlive(){
        return this.health>0;
    }
}
