package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {

    //todo напомнить в чем разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //todo сначала конструктор супер-класса (род.класс), потом this.
        this.discount = discount;
    }

    public Cat() {
        super(); //todo тестовый конструктор Animal test
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //todo static относится к классу, метод выполнятеся без экземпляра самим классом
    // аккуратно поль-ся.(пароли там не хранить)
    public static void meow(){
        System.out.println("Мяу!"); //все коты мира мяукнут, метод meow()относится к род.классу, а не экземпляру
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }
}

