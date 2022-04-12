package day33_CustomClass_Statics;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobi", "Kanis",
                "Small", "White",12, 'M');

        System.out.println(dog1);

        dog1.isEating();
        dog1.isPlaying();
        System.out.println(dog1.name);

    }
}
