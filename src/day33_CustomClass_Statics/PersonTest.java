package day33_CustomClass_Statics;

public class PersonTest {
    public static void main(String[] args) {

      Person per1 = new Person("Cemal", 47,'M');
      Person per2 = new Person("Nuran", 46, 'F');

        System.out.println(per1);
        System.out.println(per2);

        System.out.println(per1.name);

        per1.isEating("doner");

        System.out.println(per1.numberOfHeads);



    }
}
