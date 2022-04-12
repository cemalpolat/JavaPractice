package day20_Arrays;

public class ClassMatesReverse {
    public static void main(String[] args) {

        String[] classs = {"Ahmet", "Mehmet", "Ali", "Veli", "Cem", "Can", "Atahan", "Cemil", "Kemal", "Koctug"};

        for (int j = 0; j < classs.length; j++) {

            String str = classs[j];
            int a = str.length() - 1;

            for (int i = a; i >= 0; i--) {

                String rev = "";
                rev += str.charAt(i);
                System.out.print(rev);


            }
            System.out.println();

        }


    }
}
