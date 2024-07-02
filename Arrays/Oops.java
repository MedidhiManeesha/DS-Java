public class Oops {
    public static void main(String[] args) {
    // creating a Dog class , Dog() object is created
        Dog d1 = new Dog(); // you are indeed creating a new instance of the Dog class using its constructor
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.bark("manisha");

    }
    // defined a static nested class 'Dog'.
    static class Dog{
        String name;
        int age;
        void bark(){
            System.out.println(name+" is barking");
        }
        void bark(String a){
            System.out.println(a+" is eating");
        }
    }



}
