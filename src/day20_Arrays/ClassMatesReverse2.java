package day20_Arrays;

public class ClassMatesReverse2 {
    public static void main(String[] args) {

        String[] sinif = {"Ali", "Veli", "Can", "Cem"};
        for (int i = 0; i < sinif.length; i++) {

            String name = sinif[i];
            String reverse = "";

            for (int j = name.length()-1 ; j >=0 ; j--) {

               reverse += name.charAt(j);


            }
            System.out.println(reverse);
        }

    }
}