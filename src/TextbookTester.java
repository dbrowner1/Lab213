//"TextbookTester" class
public class TextbookTester {
    public static void main(String[] args) {
        //creating object textbook1 using no argument constructor
        Textbook textbook1 = new Textbook();

        //Print textbook1 using toString()
        System.out.println(textbook1);

        //create object "textbook2" using parameter constructor
        Textbook textbook2 = new Textbook("Advanced Playmaking 101", "D Browner", 400);

        // invoke getters, setters, and instance methods to test the business class
        System.out.println("Title of textbook 2: " + textbook2.getTitle());
        System.out.println("Author of textbook 2: " + textbook2.getAuthor());
        System.out.println("Number of pages in textbook 2: " + textbook2.getNumberOfPages());

        // set new values using setters
        textbook1.setTitle("Programming 101");
        textbook1.setAuthor("Aprk Q");
        textbook1.setNumberOfPages(300);

        //Display book info using instance method
        textbook1.displayBookInfo();
    }
}