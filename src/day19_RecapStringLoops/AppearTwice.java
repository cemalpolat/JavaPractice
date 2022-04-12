package day19_RecapStringLoops;

public class AppearTwice {
    public static void main(String[] args) {

        String str = "112233445566aabbccdd";
        String str1 = "";


        for (int i = 0; i < str.length(); i++) {
            String ch1 = "" + str.charAt(i);
            int num = 0;

            for (int j = 0; j < str.length(); j++) {
                String ch2 = "" + str.charAt(j);

                if (ch1.equals(ch2)) {
                    num++;
                }

            }
            if (num == 2) {
                if (!str1.contains(ch1)) {
                    str1 += ch1;

                }
            }
        }
        System.out.println(str1);


    }
}
