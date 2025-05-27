class Animal {
    void makeSound(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
    void makeSound(){
        System.out.println("Bark");
    }
    public static void main(String[] a){
        Animal a1=new Animal();
        a1.makeSound();
        Dog d1=new Dog();
        d1.makeSound();
    }
}