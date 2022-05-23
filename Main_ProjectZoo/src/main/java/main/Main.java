package main;
import model.*;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Animal[] zoo = new Animal[6];


      Animal bird = new Bird();
      bird.setName("Crow");

      Animal eagle = new Eagle();
      eagle.setName("Eagle");

      Animal beast = new Beast();
      beast.setName("Lion");

      Animal monkey = new Monkey();
      monkey.setName("Monkey");

      Animal stingray = new Stingray();
      stingray.setName("Stingray");

      Animal fish = new Fish();
      fish.setName("Shark");


      zoo[0] = fish;
      zoo[1] = stingray;
      zoo[2] = beast;
      zoo[3] = monkey;
      zoo[4] = bird;
      zoo[5] = eagle;

      while (true) {
         for (int i = 0; i < zoo.length; i++) {
            System.out.println((i + 1) + ". " + zoo[i].getName() + ".");

         }
         System.out.println("Please enter your number of animals: ");
         int animal = (new Scanner(System.in).nextInt());
         if (animal == 0 || animal > zoo.length - 1) {
            System.out.println("Animal is not found");
            continue;

         }
            System.out.println(zoo[animal - 1].getName());
            zoo[animal - 1].breathe();
            zoo[animal - 1].move();
            zoo[animal - 1].uniqueAction();

         }

      }
   }

         // write your code here





