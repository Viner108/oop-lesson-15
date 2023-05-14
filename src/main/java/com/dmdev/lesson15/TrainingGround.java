package com.dmdev.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior=new Warrior("Валерия",15,60);
        Hero mage=new Mage("Гарри Поттер", 10,40);
        Hero archer=new Archer("Робингуд", 5,45);
        Enemy enemy=new Enemy("Буратино", 100, 25);
        attackEnemy(enemy,warrior,mage,archer);
    }
    public static void attackEnemy(Enemy enemy,Hero...heroes){
            for (Hero hero:heroes) {
                while (hero.isAlive()) {
                if (enemy.isAlive() && hero.isAlive()) {
                    hero.attackEnemy(enemy);
                    if (enemy.isAlive() && hero.isAlive()) {
                        enemy.attackHero(hero);
                    }
                }
            }
            }
        if(enemy.isAlive()){
            System.out.println("Игра окончена.ВЫ ПРОИГРАЛИ!");
        }else {
            System.out.println("Вам удалась победить, вы выжили.");
        }
    }
}
