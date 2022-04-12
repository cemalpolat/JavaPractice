package day27_WrapperClasses;

public class Task4 {
    public static void main(String[] args) {

        String str = "JAVA java";

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++){

            if(Character.isUpperCase(str.charAt(i))){
                count1++;
            }
            if(Character.isLowerCase(str.charAt(i))){
                count2++;
            }
        }
            boolean r =  count1 == count2;
        System.out.println(r);
    }
}
