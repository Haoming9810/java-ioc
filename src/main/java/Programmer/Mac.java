package Programmer;

public class Mac implements Computer {
    String name;

    public Mac(String name) {
        this.name = name;
    }

    @Override
    public void use(String user, String action) {
        System.out.printf("%s is %s on a Mac called %s\n", user, action, name);
    }
}