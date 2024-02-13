   // "Person" class
public class Person {
    //instance variables
    private String name;
    private int age;
    private String eyeColor;

    //No argument constructor
    public Person() {
        // Initialize with default values
        this.name = "D Browner";
        this.age = 25;
        this.eyeColor = "Black";
    }

    //3 argument constructor
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    // getters "3"
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    // Setters "4"
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // toString method override
    @Override
    public String toString() {
        return "Person's info: Name = " + name + ", age = " + age + ", eye Color = " + eyeColor;
    }

    // "talk" method
    public void talk() {
        System.out.println("Welcome, coders! I am " + name + ".");
    }
}