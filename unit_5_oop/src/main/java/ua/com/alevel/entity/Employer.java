package ua.com.alevel.entity;

public class Employer {

    private String name;
    private int age;
    private String id;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employer: " + "id = " + id + ", name = " + name + ", age = " + age + ", position = " + position;
    }
}
