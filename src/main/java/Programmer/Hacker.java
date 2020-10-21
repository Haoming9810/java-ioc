package Programmer;

public class Hacker {
    private String name;

    public Hacker(String name) {
        this.name = name;
    }

    public void writeCode(Computer computer) {
        computer.use(name, "writing code");
    }

    public void playGame(Computer computer) {
        computer.use(name, "playing game");
    }
}
