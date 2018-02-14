import model.User;
import model.UserBuilder;

public class Main {
    public static void main(String[] args) {
        User user = UserBuilder.newBuilder()
                .setName("Arnob")
                .setAge("25")
                .setHeight("34")
                .setWeight("90")
                .build();
        System.out.println(user.toString());
    }
}
