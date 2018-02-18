import model.User;
import model.UserBuilder;

public class Main {
    public static void main(String[] args) {
        User user = UserBuilder
                .newBuilder()
                .setName("Arnob")
                .setAge("23")
                .setHeight("233")
                .setWeight("234234")
                .build();
//        Mandatory user Name Field. So this will not run.
//        User user1 = UserBuilder.newBuilder()
//                .build();
        System.out.println(user.toString());
    }
}
