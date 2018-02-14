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
        System.out.println(user.toString());
    }
}
