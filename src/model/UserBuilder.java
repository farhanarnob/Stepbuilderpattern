package model;

public class UserBuilder {

    private UserBuilder() {
    }

    public static SetName newBuilder() {
        return new Builder();
    }


    public interface SetName {
        SetAge setName(String name);
    }

    public interface SetAge extends SetHeight {
        Extra setAge(String age);
    }

    public interface SetHeight {
        ExtraWeightWithBuild setHeight(String height);

    }

    public interface SetWeight{
        ExtraHeightWithBuild setWeight(String weight);
    }

    public interface Extra extends SetHeight, SetWeight,Build{

    }
    public interface ExtraHeightWithBuild extends SetHeight,Build{

    }
    public interface ExtraWeightWithBuild extends SetWeight,Build{

    }
    public interface Build {
        User build();
    }

    public static class Builder implements SetName, SetAge, Extra, ExtraHeightWithBuild, ExtraWeightWithBuild{
        private String name = "Mr Anex";
        private String age = "79";
        private String height = "5\'8\"";
        private String weight = "78";

        @Override
        public SetAge setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Extra setAge(String age) {
            this.age = age;
            return this;
        }

        @Override
        public Builder setHeight(String height) {
            this.height = height;
            return this;
        }

        @Override
        public ExtraHeightWithBuild setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public User build() {
            return new User(name, age, height, weight);
        }
    }
}
