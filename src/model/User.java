package model;

public class User {
    private String name;
    private String age;
    private String height;
    private String weight;

    private User() {
    }

    User(String name, String age, String height, String weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
