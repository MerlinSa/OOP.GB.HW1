package main.clients;

import java.time.LocalDate;

public class  Animal {

    //видно в классе и во всех наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    // Это пустой конструктор(по умолчанию)
    public Animal(String nickName,Owner owner, LocalDate birthDate, Illness illness ) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("болеет"));//соответсвует
        // принципу dont repeat yourself
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle(){
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
        toGo();
        fly();
        swim();
    }

    private void wakeUp(){
        System.out.println("Животное проснулось!");
    }

    private void wakeUp(String time){
        System.out.println("Животное " + nickName + " проснулось в " + time);
    }

    public String getType(){
        return getClass().getSimpleName();
    }
    private void hunt(){
        System.out.println("Животное " + nickName + " охотится!");
    }
    private void eat(){
        System.out.println("Животное " + nickName + " ест!");
    }

    private void sleep(){
        System.out.println("Животное " + nickName + " спит!");
    }

    public void toGo(){
        System.out.println("Animal " + nickName + " moves");
    }

    public void fly(){
        if (getType().equals("Seagull")) {System.out.println("Chaika flies");}
       else {System.out.println("Animal can't fly");}
   }

    public void swim( ){
        if (getType().equals("Dolphin")) System.out.println("Dolphin swims");
        else System.out.println("Animal can't swim");
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s",
                nickName, birthDate, owner, illness);
    }


}

