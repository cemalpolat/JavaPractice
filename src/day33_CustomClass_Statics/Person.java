package day33_CustomClass_Statics;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean hasWings = false;
    public static int numberOfHeads = 1;
    public static int numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void isEating(String food){
        System.out.println(name + " is eating " + food );
    }

    public void isDrinking(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void isSleeping(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
