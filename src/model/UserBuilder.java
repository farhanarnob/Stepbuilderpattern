package model;

public class UserBuilder {

    private UserBuilder() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public interface SetName {
        Builder setName(String name);
    }

    public interface SetAge {
        Builder setAge(String age);
    }

    public interface SetHeight {
        Builder setHeight(String height);

    }

    public interface SetWeight {
        Builder setWeight(String weight);
    }

    public interface Build {
        User build();
    }

    public static class Builder implements SetName, SetAge, SetHeight, SetWeight, Build {

        private String name = "Mr Anex";
        private String age = "79";
        private String height = "5\'8\"";
        private String weight = "78";

        @Override
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        @Override
        public Builder setHeight(String height) {
            this.height = height;
            return this;
        }

        @Override
        public Builder setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public User build() {
            return new User(name, age, height, weight);
        }
    }
}
