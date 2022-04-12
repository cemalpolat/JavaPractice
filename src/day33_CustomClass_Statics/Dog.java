package day33_CustomClass_Statics;

public class Dog {

    public String name, breed, size, color;
    public int age;
    public char gender;

    public static int numberOfLegs = 4, numberOfEyes = 2, numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String name, String breed, String size, String color, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public void isEating(){
        System.out.println(name + " is eating");
    }

    public void isSleeping(){
        System.out.println(name + " is sleeping");
    }

    public void isPlaying(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
