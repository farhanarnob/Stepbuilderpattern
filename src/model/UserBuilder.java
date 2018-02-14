package model;

public class UserBuilder {
    private String name = "Mr Anex";
    private String age = "79";
    private String height = "5\'8\"";
    private String weight = "78";

    private UserBuilder() {
    }

    public User build() {
        return new User(name, age, height, weight);
    }

    public interface SetName{
        Builder setName(String name);
    }

    public interface SetAge {
        SetHeight setAge(String age);
    }

    public interface SetHeight {
        SetWeight setHeight(String height);

    }

    public interface SetWeight {
        UserBuilder setWeight(String weight);
    }

    public static class Builder implements SetName, SetAge, SetHeight, SetWeight {

        UserBuilder userBuilder = new UserBuilder();

        @Override
        public Builder setName(String name) {
            userBuilder.name = name;
            return this;
        }

        @Override
        public SetHeight setAge(String age) {
            userBuilder.age = age;
            return this;
        }

        @Override
        public SetWeight setHeight(String height) {
            userBuilder.height = height;
            return this;
        }

        @Override
        public UserBuilder setWeight(String weight) {
            userBuilder.weight = weight;
            return userBuilder;
        }
    }
}
