public class Animal {
    protected String name;
    protected int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
        System.out.println("Animal's sound: ");
    }

    public static void main(String[] args) {
        //using upcasting to call all objects at the same time
        Animal[] animals = { new Dog("A", 3), new Cat("B", 2), new Bird("C", 1) };
        for (Animal a : animals) {
            a.makeSound();  // Calls overridden method based on actual object type shows run time polymorphism
        }
    }
}

//dog subclass
class Dog extends Animal{
    public Dog(String name,int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Barking");
    }
}

//cat subclass
class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

//bird subclass
class Bird extends Animal{
    public Bird(String name,int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}