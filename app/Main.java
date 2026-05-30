package app;

import enums.FurColor;
import model.Cat;

public class Main {

    public static void main(String[] args) {

        Cat gato = new Cat(
                "Whiskers",
                3,
                4.2,
                FurColor.GRAY,
                true,
                "Sardinha",
                25,
                false
        );

        gato.displayInfo();

        gato.makeSound();
        gato.sleep();
        gato.purr();

        gato.move(5);
        gato.move(5, 40);
        gato.move(5, "mouse");

        gato.loseLife();
        System.out.println("Vidas: " + gato.getLives());
    }
}