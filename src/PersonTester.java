//"PersonTester" class
public class PersonTester {
    public static void main(String[] args) {
        // Create object of class "Person" using the no argument constructor
        Person person1 = new Person();

        //print person1 using toString()
        System.out.println(person1);

        //invoke setter method to set name of person1 to "Howard Roark"
        person1.setName("Howard Roark");

        //invoke the talk() method for person1
        person1.talk();
    }
}
