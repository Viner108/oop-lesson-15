package com.dmdev.lesson15;

public class Archer extends Hero{
private int health;
private Cat cat;
public Archer(String name,int damage,int health) {
        super(name, damage);
        this.health=health;
        this.cat =new Cat("Муся",5);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName()+ " прицеливается из улка в "+enemy.getName()+", пытаясь не упасть с дерева");
        cat.attackEnemy(enemy);
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
    public class Cat {
        private String name;
        private int damage;

        public  Cat(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy(Enemy enemy){
            System.out.println(name+" присоединятся к битве. "+Archer.this.getName()+" выпускает стрелу,а "+name+" лапой придает ей ускорения");
            enemy.takeDamage(damage+Archer.this.getDamage());
        }
    }
}
