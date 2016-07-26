package geekbrains.java_1.lesson_5;
import geekbrains.java_1.lesson_5.animals.Animals;
import geekbrains.java_1.lesson_5.animals.Cat;
import geekbrains.java_1.lesson_5.animals.Dog;
import geekbrains.java_1.lesson_5.animals.Horse;

import java.util.Scanner;


public class MainClass {

    private static final int animals_count = 3;
    private static int distance_run_rnd;
    private static int distance_swim_rnd;
    private static int altitude_jump_rnd;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Нажмите 1 для запуска симуляции ПОЛОСА СМЕРТИ ");
        while (sc.nextInt()==1) {
            System.out.println("Симуляция - ПОЛОСА СМЕРТИ (для животных) v1.0 . ");
            distance_run_rnd = (int) (Math.random() * 120);
            System.out.println("Ширина песчаного карьера : " + distance_run_rnd + " километров");
            distance_swim_rnd = (int) (Math.random() * 300);
            System.out.println("Ширина озера: " + distance_swim_rnd + " метров");
            altitude_jump_rnd = (int) (Math.random() * 300);
            System.out.println("Высота заборчика смерти : " + altitude_jump_rnd + " сантиметров");

            Animals[] animals = new Animals[animals_count];
            animals[0] = new Cat("Кошечка", 20, 0, 150);
            animals[1] = new Dog("Собачка", 30, 150, 100);
            animals[2] = new Horse("Лошадка", 100, 250, 200);

            System.out.println("Животные побежали через песчаный каньон :");
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].getDistance_run() >= distance_run_rnd) animals[i].canRun();
                else animals[i].cantRun();
            }

            System.out.println("Животные поплыли через озеро :");
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].getDistance_swim() >= distance_swim_rnd) animals[i].canSwim();
                else animals[i].cantSwim();
            }

            System.out.println("Животные перепрыгивают чрез заборчег смерти:");
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].getAltitude_jump() >= altitude_jump_rnd) animals[i].canJump();
                else animals[i].cantJump();
            }

            System.out.println("Нажмите 1 для запуска симуляции ПОЛОСА СМЕРТИ ");
        }
        sc.close();
    }
}