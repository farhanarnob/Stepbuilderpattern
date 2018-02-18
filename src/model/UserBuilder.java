package model;

public class UserBuilder {

    private UserBuilder() {
    }

    public static SetName newBuilder() {
        return new Builder().getSetName();
    }
    public interface SetName {
        SetAge setName(String name);
    }
    public interface SetAge {
        SetHeight setAge(String age);
    }
    public interface SetHeight {
        SetWeight setHeight(String height);

    }
    public interface SetWeight{
        Build setWeight(String weight);
    }

    public interface Build {
        User build();
    }

    public static class Builder {
        private SetName setName = (name1 -> (age1 -> (height1 -> (weight1 -> ()-> new User(name1,age1,height1,weight1)))));
        SetName getSetName() {
            return setName;
        }
    }
}
