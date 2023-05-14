package com.dmdev.lesson15;

public class Enemy implements Mortal{
    private String name;
    private int health;
    private int enemyDamage;

    public Enemy(String name, int health, int enemyDamage) {
        this.name = name;
        this.health = health;
        this.enemyDamage = enemyDamage;
    }
    public void attackHero(Hero hero){
        System.out.println(name+ " обиженно плюется в героя "+hero.getName());
        hero.takeDamage(getEnemyDamage());
    }
    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " получает смертельный урон и больше не может сражаться");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось здоровья " + health);
        }
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    @Override
    public boolean isAlive() {
        return health>0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
