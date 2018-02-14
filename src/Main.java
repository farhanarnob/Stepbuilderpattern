import model.User;
import model.UserBuilder;

public class Main {
    public static void main(String[] args) {
        User user = UserBuilder.newBuilder()
                .setName("Arnob")
                .build();
//        Mandatory user Name Field. So this will not run.
//        User user1 = UserBuilder.newBuilder()
//                .build();
        User user1 = UserBuilder.newBuilder()
                .setName("")
                .setName("Yellow")
                .setAge("")
                .setAge("89")
                .setHeight("")
                .setHeight("88")
                .setWeight("")
                .setWeight("34")
                .setName("Red")
                .build();
        System.out.println(user1.toString());
    }
}
