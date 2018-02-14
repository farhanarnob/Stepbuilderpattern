import model.User;
import model.UserBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        User newUser = new UserBuilder
                .Builder()
                .setWeight("68")
                .build();
        System.out.println(newUser.toString());
    }
}
