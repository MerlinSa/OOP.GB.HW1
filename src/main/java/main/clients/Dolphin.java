package main.clients;

import java.time.LocalDate;

public class Dolphin extends Animal {
    public Dolphin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dolphin() {
        super();
    }
}
