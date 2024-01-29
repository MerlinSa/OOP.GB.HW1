package main;

import main.clients.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal ("Котик", new Owner("Сергей Иванов"),
                LocalDate.of(2021, 10, 05),
                new Illness("лишай")); //создаем экземпляр класса

        //System.out.println(cat.getOwner());
        //System.out.println(cat.getNickName());
        //cat.setIllness(new Illness(null));
        //System.out.println("Болезнь" + cat.getIllness());

        Animal dog = new Animal("Собачка", new Owner("Ellen"), //todo hw
                LocalDate.of(2020, 1, 15),
                new Illness("грипп")); //создаем экземпляр класса
        Animal dolphin = new Dolphin("Дельфинчик", new Owner("Allan"), //todo hw
                LocalDate.of(2020, 1, 15),
                new Illness("грипп")); //создаем экземпляр класса

        Animal seagull = new Seagull("Чайка", new Owner("Ellis"), //todo hw
                LocalDate.of(2020, 1, 15),
                new Illness("грипп")); //создаем экземпляр класса


        Animal testAnimal = new Animal(); //тестовый конструктор
        //System.out.println(testAnimal.getNickName());
        cat.lifeCycle();
        System.out.println("~~~~~~~~~~~~~~~~~");
        dog.lifeCycle(); //todo hw
        System.out.println("~~~~~~~~~~~~~~~~~");
        dolphin.lifeCycle(); //todo hw
        System.out.println("~~~~~~~~~~~~~~~~~");
        seagull.lifeCycle(); //todo hw

        System.out.println("~~~~~~~~~~~~~~~~~");

        //Animal catty = new Cat();
        //Dog goodBoy = new Dog();


        System.out.println(cat.getType());
        System.out.println(dog.getType());
        System.out.println(seagull.getType()); //todo hw
        System.out.println(dolphin.getType()); //todo hw

        //System.out.println(catty);
        //Cat.meow();



        //List<Animal> animals = new ArrayList<Animal>();

        //animals.add(catty);
        //animals.add(goodBoy);
        //animals.add(cat);

        //animals.add(seagull); //todo Д/З
        //animals.add(dolphin); //todo Д/З

//       // int i = 0;
//        //for(Animal animal : animals){
//            System.out.println(i + " " + animal);
//            i++;
//        }


    }
}
