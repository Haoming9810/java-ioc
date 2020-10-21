package Programmer;

public class Programmer {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public void writeCode() {
        Mac computer = new Mac();
        computer.use(name);
    }

    public void playGame() {
        PC computer = new PC();
        computer.use(name);
    }
}
