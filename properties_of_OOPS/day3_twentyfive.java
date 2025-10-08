

class Dog extends Animal {
 Dog() {
 super("Dog"); // calls Animal(String type) constructor
 System.out.println("Dog constructor");
 }
}
public class Main {
 public static void main(String[] args) {
 Dog d = new Dog();
 }
}