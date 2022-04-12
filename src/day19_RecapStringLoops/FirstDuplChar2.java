package day19_RecapStringLoops;

public class FirstDuplChar2 {
    public static void main(String[] args) {

        String str = "bc^^12ddfghhjklpptt";

        String ch = "";
        int num = 0;

        for (int i = 0; i <= str.length()-1; i++) {

            char ch1 = str.charAt(i);
            int result = 0;

            for (int j = 0; j <= str.length()-1; j++) {

                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    result += 1;
                }

            }

            if ( result >=2){
                ch += ch1;
                num = str.indexOf(ch1);
                break;

            }

        }
        System.out.println(ch);
        System.out.println(num);

    }
}

