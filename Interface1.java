package College_Assignment;

interface Animal {

    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)

}

// Horse "implements" the Animal interface

class Horse implements Animal {

    public void animalSound() {

        // The body of animalSound() is provided here

        System.out.println("The horse says: wee wee");

    }

    public void sleep() {

        // The body of sleep() is provided here

        System.out.println("Zzz");

    }

}

public class Interface1 {

    public static void main(String[] args) {

        Horse myhorse = new Horse(); // Create a Horse object

        myhorse.animalSound();

        myhorse.sleep();

    }

}
