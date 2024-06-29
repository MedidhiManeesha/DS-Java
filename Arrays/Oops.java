public class Oops {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.bark("manisha");

    }

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
