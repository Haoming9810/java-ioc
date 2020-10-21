package Programmer;

public class PC implements Computer {
    String name;

    public PC(String name) {
        this.name = name;
    }

    @Override
    public void use(String user, String action) {
        System.out.printf("%s is %s on a PC called %s\n", user, action, name);
    }
}
