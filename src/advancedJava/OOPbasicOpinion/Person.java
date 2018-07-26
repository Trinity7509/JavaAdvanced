package advancedJava.OOPbasicOpinion;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {

            return age;

    }

    public void setAge(int age) {
        if(age>30)
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name +" - "+this.age;
    }
}
